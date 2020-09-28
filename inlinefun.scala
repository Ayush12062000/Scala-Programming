object inlinefun {
  def main(args : Array[String]){
    println("Enter number to add 1 in it:")
    var z:Int = scala.io.StdIn.readInt()
    var adding = (x:Int) => x + 1
    println(adding(z))
    println()
    
    println("Enter number to check whether it is zero or not:")
    var n:Int = scala.io.StdIn.readInt()
    var check = (y:Int) =>{
      if(y==0)
        println("entered number "+y+" is zero")
      else
        println("entered number "+y+" is not zero")
    }
    
    check(n)
    println()
    
    println("Enter 2 numbers to add / multiply ")
    println("first number=")
    var a:Int = scala.io.StdIn.readInt()
    println("Second number")
    var b:Int = scala.io.StdIn.readInt()
    
    var operationadd = (x:Int,y:Int) =>{
      x+y
    }
    var operationmul = (x:Int,y:Int) =>{
      x*y
    }
    println("adding 2 numbers = "+operationadd(a,b))
    println("Multiplying 2 numbers = "+operationmul(a,b))
  }
}
