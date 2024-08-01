//Type casting is a process of converting one data,
//type to another type, for example – converting int to long

val num1:Int=101
val num2:Long=num1.toLong()

//more function for type conversion in kotlin
    //1. toChar() – To convert a type to Char type.
    //2. toInt() – To convert a type to Int type.
    //3. toLong() – To convert a type to Long type.
    //4. toFloat() – To convert a type to Float type.
    //5. toDouble() – To convert a type to Double type.
    //6. toByte() – To convert a type to Byte type.
    //7. toShort() – To convert a type to Short type.

fun main(args: Array<String>) {
    println("4.554 to int:" + (4.554.toInt()))

    println("66 to Char:"+ (66.toChar()))

    println("B to Int:"+ ('B'.toInt()))

    val num1: Long = 5453448
    val num2: Int = num1.toInt()
    println("Number num1 is: $num1")
    println("Number num2 is: $num2")



}


