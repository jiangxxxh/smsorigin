package com.newer.sms.mapper;

import com.newer.sms.domain.NewerJob;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerJobMapper {

    @Select("select jid,jname,responsibility from newer_job")
    List<NewerJob> findAll();

    @Select("select jid,jname,responsibility from newer_job where jid=#{jid}")
    NewerJob findById(Integer jid);

    @Insert("insert into newer_job (jname,responsibility) values (#{jname},#{responsibility})")
    Integer add(NewerJob newerJob);

    @Update("update newer_job set jname=#{jname},responsibility=#{responsibility} where jid=#{jid}")
    Integer modify(NewerJob newerJob);
}
