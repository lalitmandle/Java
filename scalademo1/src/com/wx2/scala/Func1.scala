package com.wx2.scala

object Func1 {
  
  object Math{
    def add(x :Int= 45,y:Int = 15):Int = {
      return x+y
    }
    def square(x:Int)= x*x;
    def **(x:Int) = x*x;
  }
  def print(x:Int,y:Int):Unit = {
    println(x+y);
  }
  def main(args:Array[String]){
    
    var add = (x:Int,y:Int) => x+y;
    println(add(300,500));
    val sum = 10*20;
    println(sum);
    println(Math.add());
    println(Math.add(20));
    println(Math.add(20,23));
    println(Math.square(3));
    println(Math ** 4);
    print(100,200);
  }
}