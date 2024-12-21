package com.vinay.SBDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

  //If autowiring done here field injection
  // @Autowired
    Laptop l;


    //constructor injection
    // public Dev(Laptop l){
    //   this.l=l;
    // }
      //setter injection

      @Autowired
      public void setLaptop(Laptop l){
        this.l=l;
      }
    
  public void build(){
    l.compile();
    System.out.println("Working om the project!");
  }
}
