package lectures.part2oop

object OOBasics extends  App{

    val person = new Person("Dinesh",25)
    person.greet("Kaviya",31)
    person.greet("Kaviya")

}

class Person(Name :String,Age :Int){
    def greet(Name :String,Age :Int): Unit = {
        println(s"my name is ${this.Name} and age is $Age and my wife name is $Name")
    }
    def greet(Name:String):Unit={
        print(s"welcome $Name")

    }

}
