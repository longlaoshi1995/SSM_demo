package com.longjun.domain;

public class Student {
    //姓名
    String name;
    //年龄
    int age;
    //性别 0：男生 1：女生
    int sex;
    //出生地
    String birthPlace;
    //毕业院校
    String gruateSchool;
    //个人爱好
    String bobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getGruateSchool() {
        return gruateSchool;
    }

    public void setGruateSchool(String gruateSchool) {
        this.gruateSchool = gruateSchool;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBobby() {
        return bobby;
    }

    public void setBobby(String bobby) {
        this.bobby = bobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthPlace='" + birthPlace + '\'' +
                ", gruateSchool='" + gruateSchool + '\'' +
                ", bobby='" + bobby + '\'' +
                '}';
    }
}
