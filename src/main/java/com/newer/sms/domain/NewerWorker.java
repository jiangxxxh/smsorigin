package com.newer.sms.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 校区职员表
 * @author jxh
 */
public class NewerWorker implements Serializable {
    private static final long serialVersionUID = 5238804070254818541L;

    private Integer workerId;
    private String workerName;
    private Integer jid;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birth;
    private String telephone;

    private NewerJob newerJob;

    public NewerJob getNewerJob() {
        return newerJob;
    }

    public void setNewerJob(NewerJob newerJob) {
        this.newerJob = newerJob;
    }

    public NewerWorker() {
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "NewerWorker{" +
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", jid=" + jid +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
