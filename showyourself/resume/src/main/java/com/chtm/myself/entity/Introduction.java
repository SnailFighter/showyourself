package com.chtm.myself.entity;

/**
 * Created by snail on 17-8-16.
 */
public class Introduction {

    private int id;

    private String name;//姓名

    private String job;//职务

    private String img;//头像

    private int sex;//性别


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
