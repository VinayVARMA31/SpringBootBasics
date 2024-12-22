package com.vinay.SBDemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {


    @Override
    public void compile(){
        System.out.println("Desktop is a working program");
    }
}
