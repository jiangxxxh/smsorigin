package com.newer.sms.service;

import com.newer.sms.domain.NewerJob;
import com.newer.sms.mapper.NewerJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerJobService {

    @Autowired
    private NewerJobMapper newerJobMapper;

    public List<NewerJob> findAll(){
        return newerJobMapper.findAll();
    }

    public NewerJob findById(Integer jid){
        return newerJobMapper.findById(jid);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerJob newerJob){
        return newerJobMapper.add(newerJob);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerJob newerJob){
        return newerJobMapper.modify(newerJob);
    }
}
