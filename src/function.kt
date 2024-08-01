import kotlin.math.ln

fun mayclass(){
    var name ="emobilis"
    println("I learn coding at $name")
}
fun main(args: Array<String>) {

    mayclass()
    addtwonumbers()
    students("vee","oduor", 30)
    students("Dee","Bobo", 10)


}

fun addtwonumbers(){
    var num1 =7
    var num2 =8

    println("The sum of $num1 and $num2 is ${num1+num2}")
}

fun students(fname:String,lname:String,age:Int){
    println("Student name is $fname $lname and is $age years old")
}