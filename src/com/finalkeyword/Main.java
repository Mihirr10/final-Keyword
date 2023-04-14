package com.finalkeyword;

import com.finalkeyword.time.*;

public class Main extends Time {
//@Override
//   public void time(){
//     System.out.println("there are 1440 minutes in a day");
//   } // error: time()' cannot override 'time()' in 'com.finalKeyword.time.Time'; overridden method is final

  public static void main(String[] args) {

    Time time = new Time();
//    time.hour=45;  // error:Cannot assign a value to final variable 'hour'
    time.time();
  }
}