package com.newer.sms.domain;

import java.io.Serializable;

/**
 *  校区实体类
 * @author jxh
 */
public class NewerCampus implements Serializable {


    private static final long serialVersionUID = 4640597295096060398L;
    private Integer cid;
    private String cname;
    private String ccode;
    private String cloc;
    private String telephone;

    public NewerCampus() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCloc() {
        return cloc;
    }

    public void setCloc(String cloc) {
        this.cloc = cloc;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "NewerCampus{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ccode='" + ccode + '\'' +
                ", cloc='" + cloc + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
