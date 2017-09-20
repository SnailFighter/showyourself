package com.chtm.myself.web;
/**
 * Created by snail on 17-6-20.
 */

import com.chtm.myself.entity.Experience;
import com.chtm.myself.entity.Introduction;
import com.chtm.myself.entity.MyInfo;
import com.chtm.myself.entity.ReturnInfo;
import com.chtm.myself.entity.enums.ReturnCode;
import com.chtm.myself.interfaces.ExperienceService;
import com.chtm.myself.interfaces.MyInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.chtm.myself.entity.enums.ReturnCode.FAILURE;
import static com.chtm.myself.entity.enums.ReturnCode.PARAMERR;
import static com.chtm.myself.entity.enums.ReturnCode.SUCCESS;

/**
 * @auther cht
 * @create 2017-06-{DAY}-下午3:11
 * @
 */

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private MyInfoService myInfoService;
    @Autowired
    private ExperienceService experienceService;


    @RequestMapping(value="/test",produces="application/json;charset=utf-8")
    public List<Introduction> Test(HttpServletRequest request, HttpServletResponse response){

        System.out.println("test...................................");
        List<Introduction> list = new ArrayList<Introduction>();
        for(int i=0;i<8;i++) {

            Introduction introduction = new Introduction();
            introduction.setId(1111111111);
            introduction.setJob("程序员"+i);
            introduction.setName("王四"+i);
            introduction.setSex(1);
            introduction.setImg("xxxxxxxxxx");
            list.add(introduction);
        }
        return list;
    }

    @RequestMapping("/test1")
    public String Test1(HttpServletRequest request, HttpServletResponse response){

        System.out.println("test1...................................");

        return "hello world";
    }



    //个人基本信息
    @RequestMapping("/baseInfo")
    public ReturnInfo getBaseInfo(){
        ReturnInfo returnInfo = new ReturnInfo();
        MyInfo myInfo = null ;
        myInfo = myInfoService.query(1);
        if(null==myInfo){
            returnInfo.setRecode(FAILURE.getCode());
            returnInfo.setMsg(FAILURE.getMsg());
            return returnInfo;
        }

        return returnInfo;
    }

    @RequestMapping("/experience")
    public ReturnInfo getExperience(@RequestBody Map<String,String> map){
        ReturnInfo returnInfo = new ReturnInfo();
        if(StringUtils.isEmpty(map.get("userId"))){
            returnInfo.setRecode(PARAMERR.getCode());
            returnInfo.setMsg(PARAMERR.getMsg());
            return returnInfo;
        }
        List<Experience> list = experienceService.queryByUserId(Long.valueOf(Long.valueOf(map.get("userId"))),1);
        returnInfo.setMsg(SUCCESS.getMsg());
        returnInfo.setRecode(SUCCESS.getCode());
        returnInfo.setObj(list);
        return returnInfo;
    }

}
