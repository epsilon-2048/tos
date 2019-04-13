package com.example.tos.pojo;

public class Teacher {

    private String tid;
    private String tname;
    private String sex;
    private String cardNumber;
    private String password;
    private String title;
    private String phone;

    public Teacher(String tid, String tname, String sex, String cardNumber, String password, String title, String phone) {
        this.tid = tid;
        this.tname = tname;
        this.sex = sex;
        this.cardNumber = cardNumber;
        this.password = password;
        this.title = title;
        this.phone = phone;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", sex='" + sex + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
