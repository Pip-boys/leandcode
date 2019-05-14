package com.main.pojo;

/**
 * Created by Administrator on 2019/5/13 0013.
 */
public class Student {
    private String vcName;
    private String sex;
    private Integer age;

    public Student() {
    }

    public Student(String vcName, String sex, Integer age) {
        this.vcName = vcName;
        this.sex = sex;
        this.age = age;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
