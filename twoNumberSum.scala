

object twoNumberSum {
  def main(args : Array[String]){
    println("sum1 = "+ sum1(1000,12))
    println("Sum2 = "+sum2(20,50))
  }
  def sum1(x:Int,y:Int):Int={
    var s=0
    s=x+y
    return s
  }
  
  def sum2(x:Int,y:Int):Int={
    val s=x+y
    return s
  }
}