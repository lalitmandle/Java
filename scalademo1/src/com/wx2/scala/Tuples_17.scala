package com.wx2.scala
// Tuples:- tuple is a class that can contain different kind elements 

object Tuples_17 {
  val mytuple = (1,2,3,"hello",true)
  val mytuple2 = new Tuple5(1,2,3,"hello",true) // tuple1 - tuple22 element contain 
  val mytuple3 = new Tuple2(1,"hello")
  val mytuple4 = new Tuple3(1,"hello",(2,5))
  def main(args:Array[String]){
    println(mytuple)
    println(mytuple._4)//these are use as a index value
    println(mytuple2)
    println(mytuple3)
    
    mytuple.productIterator.foreach{
      i => println(i)
    }
    println(1 -> "Tom" -> true);
    println(mytuple4._3._2)
    
  }
  
}