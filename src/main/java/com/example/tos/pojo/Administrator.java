package com.example.tos.pojo;

import java.io.Serializable;

public class Administrator implements Serializable {

    private String adid;
    private String adname;
    private String sex;
    private String cardNumber;
    private String password;
    private String phone;

    public Administrator(String adid, String adname, String sex, String cardNumber, String password, String phone) {
        this.adid = adid;
        this.adname = adname;
        this.sex = sex;
        this.cardNumber = cardNumber;
        this.password = password;
        this.phone = phone;
    }

    public String getAdid() {
        return adid;
    }

    public void setAdid(String aid) {
        this.adid = aid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adid='" + adid + '\'' +
                ", adname='" + adname + '\'' +
                ", sex='" + sex + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
