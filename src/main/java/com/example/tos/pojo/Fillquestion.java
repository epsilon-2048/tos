package com.example.tos.pojo;

import java.io.Serializable;

public class Fillquestion implements Serializable {

    private int fid;

    private String fquestion;
    private String fanswer;

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
