

object Calci {
    def main(args : Array[String]){
  println("Enter 2 values : ")
    println("1st value= ")
    var a:Float = scala.io.StdIn.readFloat()
    println("2nd value= ")
    var b:Float= scala.io.StdIn.readFloat()
  
    println("Select operation.")
    println("1. Divide 2. Multiply 3. Subtract 4. Addition")
    var op:Int= scala.io.StdIn.readInt()
    var result = op match{
    case 1 => a/b;
    case 2 => a*b;
    case 3 => {
      if(a>b) a-b
      else b-a
    }
    case 4 => a+b;
  }

    println("Result ="+result)

  }
}