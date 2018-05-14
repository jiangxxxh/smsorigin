package com.newer.sms.mapper;

import com.newer.sms.domain.NewerMajor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerMajorMapper {

    @Select("select mid,mname,mcode from newer_major")
    List<NewerMajor> findAll();

    @Select("select mid,mname,mcode from newer_major where mid=#{mid}")
    NewerMajor findById(Integer mid);

    @Insert("insert into newer_major (mname,mcode) values (#{mname},#{mcode})")
    Integer add(NewerMajor newerMajor);

    @Update("update newer_major set mname=#{mname},mcode=#{mcode} where mid=#{mid}")
    Integer modify(NewerMajor newerMajor);
}
