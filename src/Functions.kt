//Functions yay!
fun main(){
    println("Please enter a number: ")
    val num1 = readLine().toString().toInt()
    println("The number is even: ${isNumberEven(num1)}")
}
fun isNumberEven(num1:Int): Boolean{
    var isNumberEven: Boolean = num1 % 2 == 0
    return isNumberEven
}
//Not much to do in functions cause well, it was quite simple ish.