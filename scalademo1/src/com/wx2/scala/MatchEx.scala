package com.wx2.scala
// Scal Match Expressions
object MatchEx {
  def main(args: Array[String]){
    val age = "50"
    age match {
      case "20" => println(age)
      case "10" => println(age)
      case "30" => println(age)
      case "50" => println(age)
      case "40" => println(age)
      
      case _ => println("default");
    }
    
    val result = age match {
      case "20" => age
      case "10" => age
      case "30" => age
      case "50" => age
      case "40" => age
      
      case _ => println("default");
    }
    println("result = "+result)
    
    val i = 7
    i match {
      case 1|3|5|7|9 =>println("odd")
      case 2|4|6|8|10 => println("even")
    }
  }
  
}