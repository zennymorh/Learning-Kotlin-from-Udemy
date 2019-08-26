fun main(){
    println("Please enter a number: ")
    var num1 = readLine()
    println("Please enter another number: ")
    var num2 = readLine()

    var temp = num1
    num1 = num2
    num2 = temp

    println("Values have been swapped")
    println("num1 is $num1")
    print("num2 is $num2")
}

//1. Declaration of a variable is done by using the colon.
//2. val is immutable but var is mutable
//kotlin is case sensitive
//replace() function