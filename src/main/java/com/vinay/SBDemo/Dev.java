package com.vinay.SBDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    Laptop l;

  public void build(){
    l.compile();
    System.out.println("Working om the project!");
  }
}
