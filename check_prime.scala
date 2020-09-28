

object check_prime {
  def main(args : Array[String]){
    println("Enter value : ")
    var a:Int = scala.io.StdIn.readInt()
    println(isprime(a))
    
    
    def isprime(x:Int): String = {
      var flag = 0
      if (x==1) flag=1
      else {
      for (i <- 2 to x-1) {
      if (x % i == 0) flag = 1
      }
      }
      if(flag==1)
        return "Not Prime"
      else
        return "Prime"
      }
    
    
  }
}