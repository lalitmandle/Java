package com.wx2.scala

object List1 {
  val l1:List[Int]= List(1,4,5,6)
  val mylist: List[Int] = List(1,2,4,5,6,8,9,4);
  val names: List[String] = List("Max","Rocky","Yash");
  def main(args:Array[String]){
    println(mylist);
    println(names);
    println(0 :: mylist);
    println(1 :: 5::9::Nil);
    println(mylist.head);
    println(names.tail);
    println(names.head);
    println(mylist.tail);
    println(mylist.isEmpty);
    println(mylist.reverse);
    println(List.fill(5)(1,2,3,4))
    println(mylist.max);
    
    mylist.foreach(println)
    var sum:Int = 0
    mylist.foreach(sum += _);
    println(sum);
    for (name <- names){
      println(name);
    }
  }
}