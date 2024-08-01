class Fruits{
    var name =""
    var color =""
    var shape =""
    var price=0

}

fun main(args: Array<String>) {
    val myobj=Fruits()
    myobj.name="oranges"
    myobj.color="Yellow"
    myobj.shape="circle"
    myobj.price=20

    println("My favorite fruit is ${myobj.name} and it cost ${myobj.price} kenya shillings")

    val obj2=Fruits()
    obj2.name="Apple"
    obj2.color="Red"
    obj2.shape="Round"
    obj2.price=50

    println("I've bought an ${obj2.name} ,which is ${obj2.color} and ${obj2.shape} in color ${obj2.color}")

}