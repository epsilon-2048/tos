package com.example.tos.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private String sid;
    private String sname;
    private String sex;
    private String cardNumber;
    private String password;
    private String department;
    private String phone;

    public Student(String sid, String sname, String sex, String cardNumber, String password, String department, String phone) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.cardNumber = cardNumber;
        this.password = password;
        this.department = department;
        this.phone = phone;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

