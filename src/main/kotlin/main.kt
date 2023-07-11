//Write two different implementations of 1 parent and 2 children classes that override
// one method - one using inheritance and another using interfaces.

fun main() {
    val parent = InheritanceParent("Salvatore", 58)
    val children1 = InheritanceChildren1("Alessandro", 27)
    val children2 = InheritanceChildren2("Mriana", 26)
    val parent1 = Parent("Salvatore", 58)
    val children3 = Children1("Alessandro", 27)
    val children4 = Children2("Mriana", 26)

    parent.getDetail()
    println(parent1.getDetail())

    children1.getDetail()
    println(children3.getDetail())

    children2.getDetail()
    println(children4.getDetail())

}


class Parent(override val name : String, override val age : Int) : PersonInterfaces {
    override fun getDetail(): String {
        return "the person's name is $name"
    }
}

class InheritanceParent(name : String, age : Int) : PersonInheritance(name, age) {
}
class Children1(override val name : String, override val age : Int) : PersonInterfaces {
    override fun getDetail(): String {
        return "the person's name is $name"
    }
}
class InheritanceChildren1( name : String, age : Int) : PersonInheritance(name, age) {
}
class Children2(override val name : String, override val age : Int) : PersonInterfaces {
    override fun getDetail(): String {
        return "the person's name is $name"
    }
}
class InheritanceChildren2(name : String, age : Int) : PersonInheritance(name, age) {
}

open class PersonInheritance( val name : String,  val age : Int) {
    open fun getDetail(){
        println("the name is $name and the age is $age")
    }
}

interface PersonInterfaces {
    val name : String
    val age : Int
    fun getDetail(): String
}
