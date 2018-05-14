package com.newer.sms.mapper;

import com.newer.sms.domain.NewerWorker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerWorkerMapper {

    List<NewerWorker> findAll(@Param("jid")Integer jid);

    @Select("select worker_id,worker_name,sex,birth,telephone,jid from newer_worker where worker_id=#{workerId}")
    NewerWorker findById(Integer workerId);

    @Insert("insert into newer_worker (worker_name,sex,birth,telephone,jid) values (#{worker_name},#{sex},#{birth},#{telephone},#{jid})")
    Integer add(NewerWorker newerWorker);

    @Update("update newer_worker set worker_name=#{worker_name},sex=#{sex},birth=#{birth},telephone=#{telephone},jid=#{jid}")
    Integer modify(NewerWorker newerWorker);
}
