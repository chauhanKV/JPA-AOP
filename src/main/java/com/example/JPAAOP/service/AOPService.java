package com.example.JPAAOP.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AOPService {

    public static Logger LOGGER = LoggerFactory.getLogger(AOPService.class);

    public String getData()
    {
        LOGGER.info("Returning Data");
        return "AOP service Data";
    }
}
