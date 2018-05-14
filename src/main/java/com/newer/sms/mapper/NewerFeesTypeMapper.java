package com.newer.sms.mapper;

import com.newer.sms.domain.NewerFeesType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewerFeesTypeMapper {

    @Select("select nft_id nftId,nft_name nftName,nft_remark nftRemark from newer_fees_type")
    List<NewerFeesType> findAll();

    @Select("select nft_id nftId,nft_name nftName,nft_remark nftRemark from newer_fees_type where nft_id=#{nftId}")
    NewerFeesType findById(Integer nftId);

    @Insert("insert into newer_fees_type (nft_name,nft_remark) values (#{nftName},#{nftRemark})")
    Integer add(NewerFeesType newerFeesType);

    @Update("update newer_fees_type set nft_name=#{nftName},nft_remark=#{nftRemark} where nft_id=#{nftId}")
    Integer modify(NewerFeesType newerFeesType);
}
