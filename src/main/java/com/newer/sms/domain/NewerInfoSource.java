package com.newer.sms.domain;

import java.io.Serializable;

/**
 * 学员信息来源表
 * @author jxh
 */
public class NewerInfoSource implements Serializable {
    private static final long serialVersionUID = 2622880815362173223L;

    private Integer infoId;
    private String infoName;

    public NewerInfoSource() {
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    @Override
    public String toString() {
        return "NewerInfoSource{" +
                "infoId=" + infoId +
                ", infoName='" + infoName + '\'' +
                '}';
    }
}
