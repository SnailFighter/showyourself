package com.chtm.myself.entity.enums;

/**
 * Created by snail on 17-8-10.
 */
public enum ReturnCode {

    SUCCESS(0000,"操作完成"),
    FAILURE(0001,"服务器失败"),
    DBERROR(2001,"数据库失败"),
    PARAMERR(3001,"参数不正确");

    private Integer code;
    private String msg;
    private ReturnCode(Integer code,String mgs){
        this.code = code;
        this.msg = mgs;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
