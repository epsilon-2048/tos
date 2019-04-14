package com.example.tos.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;


public class Choicequsetion extends BaseRowModel implements Serializable {

    private int cid;
    @ExcelProperty(value = "问题", index = 0)
    private String cquestion;
    @ExcelProperty(value = "选项A", index = 1)
    private String choicea;
    @ExcelProperty(value = "选项B", index = 2)
    private String choiceb;
    @ExcelProperty(value = "选项C", index = 3)
    private String choicec;
    @ExcelProperty(value = "选项D", index = 4)
    private String choiced;
    @ExcelProperty(value = "答案", index = 5)
    private String canswer;

    //需要无参构造函数
    public Choicequsetion() {
    }

    public Choicequsetion(int cid, String cquestion, String choicea, String choiceb, String choicec, String choiced, String canswer) {
        this.cid = cid;
        this.cquestion = cquestion;
        this.choicea = choicea;
        this.choiceb = choiceb;
        this.choicec = choicec;
        this.choiced = choiced;
        this.canswer = canswer;
    }

    public Choicequsetion(String cquestion, String choicea, String choiceb, String choicec, String choiced, String canswer) {
        this.cquestion = cquestion;
        this.choicea = choicea;
        this.choiceb = choiceb;
        this.choicec = choicec;
        this.choiced = choiced;
        this.canswer = canswer;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCquestion() {
        return cquestion;
    }

    public void setCquestion(String cquestion) {
        this.cquestion = cquestion;
    }

    public String getChoicea() {
        return choicea;
    }

    public void setChoicea(String choicea) {
        this.choicea = choicea;
    }

    public String getChoiceb() {
        return choiceb;
    }

    public void setChoiceb(String choiceb) {
        this.choiceb = choiceb;
    }

    public String getChoicec() {
        return choicec;
    }

    public void setChoicec(String choicec) {
        this.choicec = choicec;
    }

    public String getChoiced() {
        return choiced;
    }

    public void setChoiced(String choiced) {
        this.choiced = choiced;
    }

    public String getCanswer() {
        return canswer;
    }

    public void setCanswer(String canswer) {
        this.canswer = canswer;
    }

    @Override
    public String toString() {
        return "Choicequsetion{" +
                "cid=" + cid +
                ", cquestion='" + cquestion + '\'' +
                ", choicea='" + choicea + '\'' +
                ", choiceb='" + choiceb + '\'' +
                ", choicec='" + choicec + '\'' +
                ", choiced='" + choiced + '\'' +
                ", canswer='" + canswer + '\'' +
                '}';
    }
}
