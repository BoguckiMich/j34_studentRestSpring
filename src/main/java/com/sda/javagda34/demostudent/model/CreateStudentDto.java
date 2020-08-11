package com.sda.javagda34.demostudent.model;


public class CreateStudentDto {
    private String name;
    private String surName;
    private Gender sex;

    public CreateStudentDto(String name, String surName, Gender sex) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
    }

    public CreateStudentDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}
