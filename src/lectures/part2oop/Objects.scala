package lectures.part2oop
object Objects extends App
{
object Person
  def f1(x:Int) = {
    println(s"SQRT of $x is " + Math.sqrt(x))
    def f2(y:Int) = Math.sqrt(x+y)
  }
}