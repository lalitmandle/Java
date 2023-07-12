package com.wx2.scala
// map is a collaction of key-value pair and the keys are unique in the map 
// It's two type 1)- mutable, 2)immutable 
object Map_16 {
  val mymap: Map[Int,String] =  Map(801->"max",802 -> "Tom",804 -> "July",804 -> "Julyy");//immutable 
  
  def main(args: Array[String]) {
    println(mymap);
    println(mymap(802));
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    
    mymap.keys.foreach { key =>
      println("key " + key)
      println("value " + mymap(key));
    }
  }
}