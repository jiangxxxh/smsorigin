package com.newer.sms.controller;

import com.newer.sms.domain.CustomType;
import com.newer.sms.domain.NewerFeesType;
import com.newer.sms.service.NewerFeesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewerFeesTypeController {

    @Autowired
    private NewerFeesTypeService newerFeesTypeService;

    @RequestMapping(value = "/list_newerFeesType",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        CustomType customType = new CustomType(400,"查询无数据");
        List<NewerFeesType> feesTypes = newerFeesTypeService.findAll();
        if(feesTypes.size()>0){
            return new ResponseEntity<>(feesTypes,HttpStatus.OK);
        }
        return new ResponseEntity<>(customType,HttpStatus.OK);
    }
}
