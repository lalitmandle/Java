package com.wx2.scala
// set is the collection of different element of same data type 
// set can not have duplicate value inside the set 
//Not follow any order
object Set_1 {
  val myset: Set[Int] = Set(1,2,3,4,5,6,4); // 1) immutable set
  var myset2 = scala.collection.mutable.Set(1,2,3,4,5,6,3,7); //2) mutable set
  val name: Set[String] = Set("Max","Tom","Jonh");
  def main(args: Array[String]){
    println(myset+10);
    println(myset(19))
    println(myset)
    println(myset2)
    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)
    println(name)
    println(myset ++ myset2)
    println(myset.++(myset2))
    println(myset.&(myset2))
    println(myset.intersect(myset2))
    println(myset.max)
    println(myset.min)
    myset.foreach(println)
    
    for (na <- name){
      println(na)
    }
  }  
}