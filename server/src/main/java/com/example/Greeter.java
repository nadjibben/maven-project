package com.example;


public class Greeter {

  
  public Greeter() {

  }
  /** 
  * @param nom
  * @return affiche nom
  */

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
