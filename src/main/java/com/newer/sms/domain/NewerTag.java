package com.newer.sms.domain;

import java.io.Serializable;

/**
 *  学员分类表
 * @author jxh
 */
public class NewerTag implements Serializable {
    private static final long serialVersionUID = -622745508283181489L;

    private Integer tagId;
    private String tagName;
    private String tagDetail;

    public NewerTag() {
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDetail() {
        return tagDetail;
    }

    public void setTagDetail(String tagDetail) {
        this.tagDetail = tagDetail;
    }

    @Override
    public String toString() {
        return "NewerTag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", tagDetail='" + tagDetail + '\'' +
                '}';
    }
}
