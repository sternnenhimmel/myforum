package com.leon.forum.model;

import java.util.Date;

public class LoginLog {
    private Integer loginlogid;

    private Date logindate;

    private Integer userid;

    public Integer getLoginlogid() {
        return loginlogid;
    }

    public void setLoginlogid(Integer loginlogid) {
        this.loginlogid = loginlogid;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}