

object MaxAndMin {
  def main(args : Array[String]){
    println("Enter 2 values : ")
    println("1st value= ")
    var a:Int = scala.io.StdIn.readInt()
    println("2nd value= ")
    var b:Int= scala.io.StdIn.readInt()
    maxandmin(a,b);
  }
  
 def maxandmin(x:Int,y:Int)={
    
    def maxvalue()={
      if(x>y)
        println("Max= "+x)
      else
        println("Max= "+y)
    }
    
    def minvalue()={
      if(x<y)
        println("Min= "+x)
      else
        println("Min= "+y)
    }
    maxvalue();
    minvalue();
        
 }
}