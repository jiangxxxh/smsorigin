package com.newer.sms.mapper;

import com.newer.sms.domain.NewerInfoSource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerInfoSourceMapper {

    @Select("select info_id infoId,info_name infoName from newer_info_source")
    List<NewerInfoSource> findAll();

    @Select("select info_id infoId,info_name infoName from newer_info_source where info_id=#{infoId}")
    NewerInfoSource findById(Integer infoId);

    @Insert("insert into newer_info_source (info_name) values (infoName)")
    Integer add(NewerInfoSource newerInfoSource);

    @Update("update newer_info_source set info_name=#{infoName} where info_id=#{infoId}")
    Integer modify(NewerInfoSource newerInfoSource);
}
