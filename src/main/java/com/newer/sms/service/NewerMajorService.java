package com.newer.sms.service;

import com.newer.sms.domain.NewerMajor;
import com.newer.sms.mapper.NewerMajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerMajorService {

    @Autowired
    private NewerMajorMapper newerMajorMapper;

    public List<NewerMajor> findAll(){
        return newerMajorMapper.findAll();
    }
    public NewerMajor findById(Integer mid){
        return newerMajorMapper.findById(mid);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerMajor newerMajor){
        return newerMajorMapper.add(newerMajor);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerMajor newerMajor){
        return newerMajorMapper.modify(newerMajor);
    }
}
