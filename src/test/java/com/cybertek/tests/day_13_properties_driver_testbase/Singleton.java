package com.cybertek.tests.day_13_properties_driver_testbase;

public class Singleton {

    //singleton class will have private constructor
    //it means other classes cannot create object of this class

      private  Singleton(){}
      private  static String str;


      public static String getInstance(){

          if(str==null){
              //if str has no value, initialize it and return it

              System.out.println("str is null. assinging value to it.");
              str="somevalue";
          }else {
              //if it has value just return it
              System.out.println("it has value just return it ");
          }

      return  str;


      }









}
