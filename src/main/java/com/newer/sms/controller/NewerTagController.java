package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerTag;
import com.newer.sms.service.NewerTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewerTagController {

    @Autowired
    private NewerTagService newerTagService;

    @RequestMapping(value = "/list_newerTag",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerTag> tags = newerTagService.findAll();
        if(tags.size()>0){
            return new ResponseEntity<>(tags,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
