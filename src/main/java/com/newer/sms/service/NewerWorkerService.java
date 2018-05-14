package com.newer.sms.service;

import com.newer.sms.domain.NewerWorker;
import com.newer.sms.mapper.NewerWorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewerWorkerService {
    @Autowired
    private NewerWorkerMapper newerWorkerMapper;

    public List<NewerWorker> findAll(Integer jid){
        return newerWorkerMapper.findAll(jid);
    }

    public NewerWorker findById(Integer workerId){
        return newerWorkerMapper.findById(workerId);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer add(NewerWorker newerWorker){
        return newerWorkerMapper.add(newerWorker);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer modify(NewerWorker newerWorker){
        return newerWorkerMapper.modify(newerWorker);
    }
}
