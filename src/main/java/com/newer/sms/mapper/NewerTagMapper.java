package com.newer.sms.mapper;

import com.newer.sms.domain.NewerTag;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerTagMapper {

    @Select("select tag_id tagId,tag_name tagName,tag_detail tagDetail from newer_tag")
    List<NewerTag> findAll();

    @Select("select tag_id tagId,tag_name tagName,tag_detail tagDetail from newer_tag where tag_id=#{tagId}")
    NewerTag findById(Integer tagId);

    @Insert("insert into newer_tag (tag_name,tag_detail) values (#{tagName},#{tagDetail})")
    Integer add(NewerTag newerTag);

    @Update("update newer_tag set tag_name=#{tagName},tag_detail=#{tagDetail} where tag_id=#{tagId}")
    Integer modify(NewerTag newerTag);
}
