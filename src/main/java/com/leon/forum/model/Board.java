package com.leon.forum.model;

public class Board {
    private Integer boardid;

    private String boardname;

    private String boarddec;

    private Integer cratedby;

    private Integer ownerid;

    public Integer getBoardid() {
        return boardid;
    }

    public void setBoardid(Integer boardid) {
        this.boardid = boardid;
    }

    public String getBoardname() {
        return boardname;
    }

    public void setBoardname(String boardname) {
        this.boardname = boardname == null ? null : boardname.trim();
    }

    public String getBoarddec() {
        return boarddec;
    }

    public void setBoarddec(String boarddec) {
        this.boarddec = boarddec == null ? null : boarddec.trim();
    }

    public Integer getCratedby() {
        return cratedby;
    }

    public void setCratedby(Integer cratedby) {
        this.cratedby = cratedby;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }
}