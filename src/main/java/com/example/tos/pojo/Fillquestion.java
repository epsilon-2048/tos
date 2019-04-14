package com.example.tos.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class Fillquestion extends BaseRowModel implements Serializable {

    private int fid;

    @ExcelProperty(value = "问题", index = 0)
    private String fquestion;
    @ExcelProperty(value = "答案", index = 1)
    private String fanswer;

    public Fillquestion() {
    }

    public Fillquestion(String fquestion, String fanswer) {
        this.fquestion = fquestion;
        this.fanswer = fanswer;
    }

    public Fillquestion(int fid, String fquestion, String fanswer) {
        this.fid = fid;
        this.fquestion = fquestion;
        this.fanswer = fanswer;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFquestion() {
        return fquestion;
    }

    public void setFquestion(String fquestion) {
        this.fquestion = fquestion;
    }

    public String getFanswer() {
        return fanswer;
    }

    public void setFanswer(String fanswer) {
        this.fanswer = fanswer;
    }

    @Override
    public String toString() {
        return "Fillquestion{" +
                "fid=" + fid +
                ", fquestion='" + fquestion + '\'' +
                ", fanswer='" + fanswer + '\'' +
                '}';
    }
}
