package com.chtm.myself.entity;

/**
 * Created by snail on 17-6-20.
 */

import java.util.Date;

/**
 * @auther cht
 * @create 2017-06-20-下午12:42
 * @工作经历
 */
public class Experience {
    private long id;
    private String company_name;
    private String job;         //职位
    private Date start_time;
    private Date end_time;
    private String content;     //工作内容
    private String develop_environment;//开发环境
    private String develop_tool;      //开发工具
    private String frameworks;        //开发框架
    private int status;                 //是否可见  0 不可见 1 可见
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDevelop_environment() {
        return develop_environment;
    }

    public void setDevelop_environment(String develop_environment) {
        this.develop_environment = develop_environment;
    }

    public String getDevelop_tool() {
        return develop_tool;
    }

    public void setDevelop_tool(String develop_tool) {
        this.develop_tool = develop_tool;
    }

    public String getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(String frameworks) {
        this.frameworks = frameworks;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
