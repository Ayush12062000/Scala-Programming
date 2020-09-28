

object Operators_Program3 {
  def main(args : Array[String]){
    
  var a = 10;
  var b = 4;
  var c = true; 
  var d = false; 
  var result = 0; 
  
  
  if (a == b)
  {
    println ("Equal To Operator is True");
  }
  else
  {
    println ("Equal To Operator is False");
  }
  
  result = a & b;
  
  a += 100
  
  println ("Addition is: "+ (a + b) );
  println ("Subtraction is: "+ (a - b) ) ;
  println("Logical Or of a || b = " + (c || d));
  println ("Bitwise AND: " + result );
  println ("Addition Assignment Operator: " + a );
}
}