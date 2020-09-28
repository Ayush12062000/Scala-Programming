

object conversion {
  def main(args : Array[String]){
  println("Enter Temperature in Fahrenheit: ")
  //Temperature conversion
    var f:Float = scala.io.StdIn.readFloat()
    ftc(f)
    
    def ftc(f : Float)= {
    var c =((f-32)*5)/9  
  println("Temperature in Celsius is: "+c)
  }
  
  // number in inches to meters.
  println("Enter value in inches : ")
    var i:Float = scala.io.StdIn.readFloat()
    println("Value in meters = "+ i*0.0254)

  }   
}