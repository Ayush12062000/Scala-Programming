

object evenoddmulti {
   def main(args : Array[String]){
    println("Enter a number = ")
    var x:Int = scala.io.StdIn.readInt()
    evenodd(x)
  }
  
  def evenodd(x:Int)={
    def check()={
      againcheck()
      def againcheck()={
        if(x % 2 == 0)
          println(x+" is even")
        else
          println(x+" is odd")
    }
    }
    check()
  }
}