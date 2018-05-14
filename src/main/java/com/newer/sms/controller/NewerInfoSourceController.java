package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerInfoSource;
import com.newer.sms.service.NewerInfoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NewerInfoSourceController {

    @Autowired
    private NewerInfoSourceService newerInfoSourceService;

    @RequestMapping(value = "/list_newerInfoSource",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerInfoSource> infoSources = newerInfoSourceService.findAll();
        if(infoSources.size()>0){
            return new ResponseEntity<>(infoSources,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
