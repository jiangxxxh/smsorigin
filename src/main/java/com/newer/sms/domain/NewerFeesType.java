package com.newer.sms.domain;

import java.io.Serializable;

/**
 *  费用类型实体类
 * @author jxh
 */
public class NewerFeesType implements Serializable {
    private static final long serialVersionUID = 1349193076710536170L;
    private Integer nftId;
    private String nftName;
    private String nftRemark;

    public NewerFeesType() {
    }

    public Integer getNftId() {
        return nftId;
    }

    public void setNftId(Integer nftId) {
        this.nftId = nftId;
    }

    public String getNftName() {
        return nftName;
    }

    public void setNftName(String nftName) {
        this.nftName = nftName;
    }

    public String getNftRemark() {
        return nftRemark;
    }

    public void setNftRemark(String nftRemark) {
        this.nftRemark = nftRemark;
    }

    @Override
    public String toString() {
        return "NewerFeesType{" +
                "nftId=" + nftId +
                ", nftName='" + nftName + '\'' +
                ", nftRemark='" + nftRemark + '\'' +
                '}';
    }
}
