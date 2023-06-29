package interfacesImpl
//Write two different implementations of 1 parent and 2 children classes that override
// one method - one using inheritance and another using interfaces.

fun main() {
    val parent = Parent("Salvatore", 58)
    val children1 = Children1("Alessandro", 27)
    val children2 = Children2("Mriana", 26)

    println(parent.interfaces())
    println(children1.interfaces())
    println(children2.interfaces())

}


class Parent(override val name : String, override val age : Int) : Interfaces {
}

class Children1(override val name : String, override val age : Int) : Interfaces {
}

class Children2(override val name : String, override val age : Int) : Interfaces {
}


interface Interfaces {
    val name : String
    val age : Int
    fun interfaces(): String {
        return "the name is $name and the age is $age"
    }
}

