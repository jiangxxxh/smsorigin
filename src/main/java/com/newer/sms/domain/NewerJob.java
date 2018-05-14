package com.newer.sms.domain;

import java.io.Serializable;

/**
 * 职业类型表
 * @author jxh
 */
public class NewerJob implements Serializable {
    private static final long serialVersionUID = 1740577391380314406L;

    private Integer jid;
    private String jname;
    private String responsibility;

    public NewerJob() {
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "NewerJob{" +
                "jid=" + jid +
                ", jname='" + jname + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }
}
