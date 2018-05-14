package com.newer.sms.service;

import com.newer.sms.domain.NewerTag;
import com.newer.sms.mapper.NewerTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerTagService {

    @Autowired
    private NewerTagMapper newerTagMapper;

    public List<NewerTag> findAll(){
        return newerTagMapper.findAll();
    }
    public NewerTag findById(Integer tagId){
        return newerTagMapper.findById(tagId);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerTag newerTag){
        return newerTagMapper.add(newerTag);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerTag newerTag){
        return newerTagMapper.modify(newerTag);
    }
}
