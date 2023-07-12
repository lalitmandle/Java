package com.wx2.scala
// Function in scala
object Func {
  // def functionName(varibleName : Datatype,varible2:Datatype):return_result_DataType = {
  //return Expression}
  
  object Math{
    def add(x :Int,y:Int):Int = {
      return x+y
    }
    def square(x:Int) = x*x;
  }
  
  def add(x :Int,y:Int):Int = {
    return x+y
  }
  def subtract(x :Int,y:Int):Int = {
    x-y
  }
  def multiply(x :Int,y:Int):Int = x*y
  
  def divide(x :Int,y:Int)= x/y
  
  
  
  
  def main(args: Array[String]){
    println(Math.add(23,23))
    println(Math.square(3))
    println(add(23,22))
    println(subtract(23,22))
    println(multiply(23,22))
    println(divide(23,22))
  }
  
}