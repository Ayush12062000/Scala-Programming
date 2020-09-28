

object scf {
  def main(args : Array[String]){
     println("Enter value : ")
    var a:Int = scala.io.StdIn.readInt()
    println("Square of the number = "+ Math.pow(a,2))
    println("Cube of the number = "+ Math.pow(a,3))
    println("Forth power of the number = "+ Math.pow(a,4))
  }
}