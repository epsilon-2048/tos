package com.example.tos.pojo;

public class Choicequsetion {

    private int cid;
    private String cquestion;
    private String choicea;
    private String choiceb;
    private String choicec;
    private String choiced;
    private String canswer;

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
