package com.chtm.myself.entity;

/**
 * Created by snail on 17-8-10.
 */
public class ReturnInfo {
    private Integer recode;
    private String msg;
    private Object obj;

    public Integer getRecode() {
        return recode;
    }

    public void setRecode(Integer recode) {
        this.recode = recode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
