package com.wx2.scala

object Func_Currying {
  def add(x:Int, y:Int) = x+y
  def add2(x:Int) = (y:Int) => x+y;
  def add3(x:Int) (y:Int) = x+y;
  def main(args:Array[String]){
    println(add(20,10));
    println(add2(20)(10));
    val sum = add2(40);
    println(sum(50));
    println(add3(100)(200));
    val sum1= add3(50)_;
    println(sum1(100))
  }
}