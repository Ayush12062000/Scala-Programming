

object Readline_Function {
  def main(args : Array[String]){
    while(true){
      val read= scala.io.StdIn.readLine()
      println("You Entered = "+read)
    }
  }
}