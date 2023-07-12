package com.wx2.scala

object IfElse {
  def main(args:Array[String]){
    val x:Int = 20
    var y = ""
    if (x==20){
      y = "x == 20"
    }
    else{
      y = "x != 20"
    }
    println(y)
    
    val z = if (x==20) "x is equal to 20" else "x != 20"
     println(z)
  }
}