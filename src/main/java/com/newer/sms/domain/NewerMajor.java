package com.newer.sms.domain;

import java.io.Serializable;

/**
 *  专业表
 * @author jxh
 */
public class NewerMajor implements Serializable {
    private static final long serialVersionUID = 7676340140471569190L;

    private Integer mid;
    private String mname;
    private String mcode;

    public NewerMajor() {
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    @Override
    public String toString() {
        return "NewerMajor{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mcode='" + mcode + '\'' +
                '}';
    }
}
