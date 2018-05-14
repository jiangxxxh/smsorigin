package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerCampus;
import com.newer.sms.service.NewerCampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewerCampusController {
    @Autowired
    private NewerCampusService newerCampusService;

    @RequestMapping(value = "/list_newerCampus",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerCampus> campuses = newerCampusService.findAll();
        if(campuses.size()>0){
            return new ResponseEntity<>(campuses,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
