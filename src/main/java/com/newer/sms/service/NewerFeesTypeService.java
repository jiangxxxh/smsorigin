package com.newer.sms.service;

import com.newer.sms.domain.NewerFeesType;
import com.newer.sms.mapper.NewerFeesTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerFeesTypeService {

    @Autowired
    private NewerFeesTypeMapper newerFeesTypeMapper;

    public List<NewerFeesType> findAll(){
        return newerFeesTypeMapper.findAll();
    }
    public NewerFeesType findById(Integer nftId){
        return newerFeesTypeMapper.findById(nftId);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerFeesType newerFeesType){
        return newerFeesTypeMapper.add(newerFeesType);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerFeesType newerFeesType){
        return newerFeesTypeMapper.modify(newerFeesType);
    }
}
