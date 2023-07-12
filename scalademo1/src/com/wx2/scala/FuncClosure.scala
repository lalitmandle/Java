// scala - Closures
/* A closure is a function which uses one or more 
  variable declared outside this function */
package com.wx2.scala
import java.util.Date

object FuncClosure {
  var number = 10;
  val add = (x:Int) =>{
    number = x+number;
    number;
  }
  def main(args:Array[String]){
    number = 100;
    println(add(20));
    println(number);
  }
  
}