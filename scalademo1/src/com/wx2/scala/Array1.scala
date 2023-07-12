package com.wx2.scala
import Array._
object Array1 {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  val myarray3 = Array(1,2,3,4,5,6)
  def main(args: Array[String]){
    myarray(0) = 20;
    myarray(1) = 30;
    myarray(2) = 10;
    myarray(3) = 50;
    println(myarray);
    println(myarray3.length)
    
    //concat in array
    val result = concat(myarray,myarray3);
    for (x <- result){
      println(x);
    }
    for (x <- myarray){
      println(x);
    }
    for (i <- 0 to (myarray.length - 1)){
      println(myarray(i));
    }
  }
}