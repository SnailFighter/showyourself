package com.example.demo.idempotent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@RestController
public class IdempotentController {

    private BigDecimal bankAmount=new BigDecimal(0);
    private BigDecimal bankAmount1=new BigDecimal(0);

    private final static long duration = 30000;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @PostMapping("/bankAmount")
    public String addAmount(@NotNull BigDecimal num) throws InterruptedException {
        Thread.sleep(5000);
        bankAmount = bankAmount.add(num);
        return bankAmount.toString();
    }

    @GetMapping("/token")
    public String getToken(@NotNull String sessionId,@NotNull String function){
        String token =  UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(sessionId+function,token,duration);
        return token;
    }

    @PostMapping("/bankAmount1")
    public String addAmount1(@NotNull String sessionId,@NotNull BigDecimal num,@NotNull String token) throws InterruptedException {
        String tokenInRedis = redisTemplate.opsForValue().get(sessionId+"bankAmount1");
        if(StringUtils.isEmpty(tokenInRedis)||!tokenInRedis.equals(token)){
            return "请勿重复操作";
        }
        Thread.sleep(5000);
        redisTemplate.delete(sessionId+"bankAmount1");
        bankAmount1 = bankAmount1.add(num);
        return bankAmount1.toString();
    }


}
