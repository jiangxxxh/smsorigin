package com.newer.sms.mapper;

import com.newer.sms.domain.NewerCampus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerCampusMapper {

    @Select("select cid,cname,ccode,cloc,telephone from newer_campus")
    List<NewerCampus> findAll();

    @Select("select cid,cname,ccode,cloc,telephone from newer_campus where cid=#{cid}")
    NewerCampus findById(Integer cid);

    @Insert("insert into newer_campus (cname,ccode,cloc,telephone) values (#{cname},#{ccode},#{cloc},#{telephone})")
    Integer add(NewerCampus newerCampus);

    @Update("update newer_campus set cname=#{cname},ccode=#{ccode},cloc=#{cloc},telephone=#{telephone} where cid=#{cid}")
    Integer modify(NewerCampus newerCampus);
}
