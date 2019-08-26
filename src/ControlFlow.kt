@file:Suppress("IMPLICIT_CAST_TO_ANY")
fun calc(){
    println("Please enter num1: ")
    val num1 = readLine().toString().toInt()
    println("Please enter num2: ")
    val num2 = readLine().toString().toInt()
    println("Please enter a math operator   +   -   /    *   ")
    val result = when (readLine()) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> num1/num2
        "*" -> num1 * num2
        else -> "Please enter a valid operator!"
    }
    print (result)
}
fun main(){
   println("Please enter your age: ")
    val age = readLine().toString().toInt()
    val young = 0..17
    val prime = 18..27
    val mature= 28..49
    val old = 50..70
    var desc = when(age){
        in young -> "You are young"
        in prime-> "You are in your prime"
        in mature -> "You are matured"
        in old-> "You are old"
        else -> "Not in the range!"
    }
    println(desc)

}
fun expression(){
    //These are statements
   val a = 3
   val b: Int = 8
    println("Hello Kotlin!")
    //These are expressions
    val x = 3 + 5
    val z = x + a
    //   * if is an expression in kotlin but a statement in java
    val max = if (a>b){
        a
    }
    else{
        b
    }
    println("The larger number is $max")
    println("Please enter a number between 1 and 10: ")
    val num = (readLine().toString().toInt())
    val result = when (num){
        2, 3, 5, 7 -> "Prime number found!"
        1, 4, 6, 8, 9, 10 -> "Not a prime number!"
        else -> "Not in the range!"
    }
    print (result)
    //learnt debugging!!
// /*
//   * string, firstly to a string, and then to an integer
//   * equality operators    ==  !=
//   * relational operators <    >   <=  >=
//    */
}


fun star(){
    val num = (readLine().toString().toInt())
    println("Please enter a number that is between 1 and 5: ")
    val ans =  when (num) {
        1 -> "Poor"
        2 -> "Fair"
        3 -> "Good"
        4 -> "Very Good"
        5 -> "Excellent"
        else -> println("Please enter a valid number")
    }
}
