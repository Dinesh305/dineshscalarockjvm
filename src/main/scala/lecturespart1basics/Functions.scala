package lecturespart1basics

object Functions extends  App {
  def aFunction(a: String, b: String): String = {
    val dc=a + " " + b
    dc

  }
  def arepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else
      aString + " " + arepeatedFunction(aString, n -1)
  }
  println(arepeatedFunction("hello", 5))

  def sideEffect() = {

    println("sideeffect")

  }
  sideEffect()
  //GreetingFunction
  def greetingsFun(Name: String, Age: Int): String = {
     s"Hi my name is $Name and I am $Age year old"

  }
  println(greetingsFun("dinesh",32))

  //FactorialFunction

  def factorialFun(n:Int):Int=
    if (n<=0) 1 else {
    n*factorialFun(n-1)
    }
  println(factorialFun(8))

  //Fibonacci series

  def Fibonacci(n:Int):Int={
    if (n<=2) 1
    else
      Fibonacci(n-1)+Fibonacci(n-2)
  }

  println(Fibonacci(8))

}
