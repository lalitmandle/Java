package com.wx2.scala
// Scala - Higher -Order Functions
object FuncHO {
  
    def math(x: Double,y:Double,f:(Double,Double) => Double):Double = f(x,y);
    def math1(x: Double,y:Double,z:Double,f:(Double,Double) => Double):Double = f(f(x,y),z);
  
   def main(args: Array[String]){
    val result = math(50,20,(x,y)=> x + y);
    val res = math(50,20,(x,y)=>x max y);
    val res1 = math(50,20,_+_); //also do same its called wildcard notion 
    println(result);
    println(res);
    println(res1)
    val result1 = math1(50,20,10,(x,y)=>x+y);
    println(result1);
  }
}