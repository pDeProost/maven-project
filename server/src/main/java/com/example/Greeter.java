package com.example;


import java.lang.Math;
/**
* this is a Class
*/

public class Greeter {
 
  /**
  * this in contructor
  */
 
  public Greeter() {
   // contructeur par défaut
  }

   public void doSomeThing() {
   // do no thing yet !
  }
 
   public void doSomeThing2() {
   // do no thing yet !
  }

 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
   return String.format("Hello World, %s!", someone);
   
 }
}
