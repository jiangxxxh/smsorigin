package com.newer.sms.service;

import com.newer.sms.domain.NewerCampus;
import com.newer.sms.mapper.NewerCampusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerCampusService {

    @Autowired
    private NewerCampusMapper newerCampusMapper;

    public List<NewerCampus> findAll(){
        return newerCampusMapper.findAll();
    }
    public NewerCampus findById(Integer cid){
        return newerCampusMapper.findById(cid);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerCampus newerCampus){
        return newerCampusMapper.add(newerCampus);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerCampus newerCampus){
        return newerCampusMapper.modify(newerCampus);
    }
}
