

object MaxMinMultiNested {
  def main(args: Array[String]) 
{ 
    println("Enter 2 values : ")
    println("1st value= ")
    var a:Int = scala.io.StdIn.readInt()
    println("2nd value= ")
    var b:Int= scala.io.StdIn.readInt()
    maxAndMin(a, b); 
} 
  
  
def maxAndMin(a: Int, b: Int) = { 

 def findmax()={
   maxValue()
  def maxValue() = { 
    if(a > b)  
      println("Max is: " + a) 
    else 
      println("Max is: " + b) 
} 
 }

def findmin()={
  minValue()
  def minValue() = { 
    if (a < b)  
      println("Min is: " + a)  
    else 
      println("Min is: " + b) 
    } 
  }
findmax(); 
findmin(); 
  }
}