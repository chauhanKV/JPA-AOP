package com.example.JPAAOP.controller;

import com.example.JPAAOP.service.AOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AOPController {

    @Autowired
    private AOPService aopService;

    @GetMapping("/data")
    public ResponseEntity<String> getData()
    {
        // In this controller we are directly calling the getData() method, there is no specification of aspect.
        // But in Simple Aspect we have defined @Before Annotation with mapping / expression of the method in service class.
        String aopResponse = aopService.getData();
        return ResponseEntity.ok().body(aopResponse);
    }
}
