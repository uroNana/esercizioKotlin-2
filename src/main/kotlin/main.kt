//Write two different implementations of 1 parent and 2 children classes that override
// one method - one using inheritance and another using interfaces.

fun main() {
    val parent = Parent("Salvatore", 58)
    val children1 = Children1("Alessandro", 27)
    val children2 = Children2("Mriana", 26)

    parent.inheritance()
    println(parent.interfaces())

    children1.inheritance()
    println(children1.interfaces())

    children2.inheritance()
    println(children2.interfaces())

}


class Parent(override val name : String, override val age : Int) : Interfaces, Inheritance(name, age) {
}

class Children1(override val name : String, override val age : Int) : Interfaces, Inheritance(name, age) {
}

class Children2(override val name : String, override val age : Int) : Interfaces, Inheritance(name, age) {
}

open class Inheritance(open val name : String, open val age : Int) {
    fun inheritance(){

        println("the name is $name and the age is $age")
    }
}

interface Interfaces {
    val name : String

    fun interfaces(): String {
        return "the person's name is $name"
    }
}
