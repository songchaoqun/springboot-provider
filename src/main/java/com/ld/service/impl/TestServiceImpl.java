package com.ld.service.impl;

import com.ld.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String say(String something) {
        return "李港说了:"+something;
    }

}
