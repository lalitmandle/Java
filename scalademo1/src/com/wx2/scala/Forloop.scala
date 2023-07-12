package com.wx2.scala

object Forloop {
  def main(args:Array[String]){
   for (i <- 1 to 5){
     println("i using to " +i)
   }
   for (i <- 1.to(5)){
     println("i using to " +i)
   }
   for (i <- 1 until 5){
     println("i using until " +i)
   }
   for (i <- 1 to 3; j <- 1 to 3){
     println("i using multiple ranges " +i +" "+j)
   }
   val lst = List(1,2,3,4,5,6,7,8,9)
   for (i <- lst){
     println("i using lst " +i)
   }
   for (i <- lst;if i < 6){
     println("i using Filter " +i)
   }
   var result = for {i <- lst; if i <5}yield{
     i*i
   }
   println("result = "+result)
  }
}