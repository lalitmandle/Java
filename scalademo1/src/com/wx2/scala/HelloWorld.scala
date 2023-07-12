package com.wx2.scala

object HelloWorld {
  def main(args:Array[String]){
    val name = "Mark"
    val age = 18
    println("Hello World")
    println("My Name is " + name +"and my age is "+age)
    println(s"$name is $age year old")
  }
}