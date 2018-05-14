package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerWorker;
import com.newer.sms.service.NewerWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewerWorkerController {

    @Autowired
    private NewerWorkerService newerWorkerService;

    @RequestMapping(value = "/list_newerWorker/{jid}",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(@PathVariable("jid")Integer jid){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerWorker> workers = newerWorkerService.findAll(jid);
        if(workers.size()>0){
            return new ResponseEntity<>(workers,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
