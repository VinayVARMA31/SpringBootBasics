package com.vinay.SBDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {


    @Override
    public void compile(){
        System.out.println("laptop is a working program");
    }
}
