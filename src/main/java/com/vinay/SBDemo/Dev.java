package com.vinay.SBDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

  //If autowiring done here field injection
   @Autowired
   private  Computer comp;


    //constructor injection
    // public Dev(Laptop l){
    //   this.l=l;
    // }
      //setter injection

      // @Autowired
      // public void setLaptop(Computer comp){
      //   this.comp=comp;
      // }
    
  public void build(){
    comp.compile();
    System.out.println("Working om the project!");
  }
}
