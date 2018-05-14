package com.newer.sms.service;

import com.newer.sms.domain.NewerInfoSource;
import com.newer.sms.mapper.NewerInfoSourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class NewerInfoSourceService {
    @Autowired
    private NewerInfoSourceMapper newerInfoSourceMapper;

    public List<NewerInfoSource> findAll(){
        return newerInfoSourceMapper.findAll();
    }
    public NewerInfoSource findById(Integer infoId){
        return newerInfoSourceMapper.findById(infoId);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerInfoSource newerInfoSource){
        return newerInfoSourceMapper.add(newerInfoSource);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerInfoSource newerInfoSource){
        return newerInfoSourceMapper.modify(newerInfoSource);
    }
}
