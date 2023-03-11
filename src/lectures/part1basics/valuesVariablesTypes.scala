package lecturespart1basics

object valuesVariablesTypes {

  def main(args: Array[String]): Unit = {


    val x = 10
    println(x)
    var y = 33
    println(s"the output of value y is $y")

    val acondition= true

    val acondidtionValue =  5 > 3
    println(acondidtionValue)


    val codeblock =
    {
      val x = 10;
      val y = 20;

      println(if(x>y) "Not correct" else "Good")
    }

    val a = "Welcome"
    val b = a+codeblock

    println(b)


    def recurfun(string: String,int: Int ): String = {

      if(int==1) string
        else
      string+recurfun(string,int-1)
      }
    println(recurfun("dinesh",5))

  }
}