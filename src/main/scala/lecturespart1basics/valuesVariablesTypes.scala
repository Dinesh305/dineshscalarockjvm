package lecturespart1basics

object valuesVariablesTypes extends App{

  val x = 10
  println(x)
  var y = 33
  println(s"the output of value y is $y")
  val aboolean: Boolean =true
  println(aboolean)

  val acondition: Int = if(aboolean) 5 else 3
 // println(acondition)

  //while loop

  var a = 1

  while (a<10){
    println(a)
    a+=2
  }



}
