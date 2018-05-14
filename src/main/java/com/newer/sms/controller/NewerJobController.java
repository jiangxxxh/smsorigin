package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerJob;
import com.newer.sms.service.NewerJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewerJobController {

    @Autowired
    private NewerJobService newerJobService;

    @RequestMapping(value = "/list_newerJob",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerJob> jobs = newerJobService.findAll();
        if(jobs.size()>0){
            return new ResponseEntity<>(jobs,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
