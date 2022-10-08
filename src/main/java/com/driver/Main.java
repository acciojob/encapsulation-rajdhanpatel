package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly r = new RWOnly();
//      r.ans = 10;
//      System.out.println(r.ans);
      //java: ans has private access in com.driver.RWOnly

      r.setName("amit");
      String value = r.getName();
      System.out.println(value);

  }
}
