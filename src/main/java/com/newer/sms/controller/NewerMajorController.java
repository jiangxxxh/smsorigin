package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerMajor;
import com.newer.sms.service.NewerMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NewerMajorController {

    @Autowired
    private NewerMajorService newerMajorService;

    @RequestMapping(value = "/list_newerMajor",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerMajor> newerMajors = newerMajorService.findAll();
        if(newerMajors.size()>0){
            return new ResponseEntity<>(newerMajors,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
