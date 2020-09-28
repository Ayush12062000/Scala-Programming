class introduction{
  var name = "Ayush Kesarwani"
  var age :Int = 20
  var branch:String = "CSE"
  def show(){
    println("--Class Demonstration--")
    println("Hello! my name is " + name + " and my age is "+age); 
    println("My branch name is " + branch);}
}
object Keyword_use {
  def main(args : Array[String]){
    println("using different keywords like-")
    println("class,def,do,if,else,for,return,<-,while,var,val,new")
    println()
    var ob = new introduction()
    ob.show()
  //Loops 
    println("--For loop--")
    for(i<-0 to 10
        if i%5==0)
      println("Machine Learning")  
    var i=5
    println("--While Loop--")
    while(i!=0){
      if(i%2==0)
        println("i= "+i)
      else
        println("****")
      i-=1
    }
    var x=6
    println("--Do while loop--")
    do{
      println("x= "+ x)
      x-=2
    }while(x!=0); 
    println()
    println("Sum = "+ sum(10,20,30))
  }
  def sum(x:Int,y:Int,z:Int):Int={
    val s=x+y+z
    return s
  }
}