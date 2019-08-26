fun main(){
    //This is how to declare a list. This is an immutable list
   var myFriendsList = listOf<String>("Emma", "Ken", "Akanni", "Tobi")
    //to create a mutable list, we use
    var myFriendsToo = mutableListOf<String>("Praise", "Seyi", "Favour")
    myFriendsToo.add("Sade")
    //adding at a specific index
    myFriendsToo.add(2, "Bisola")
    myFriendsToo.removeAt(1)
    myFriendsToo.remove("Praise")
    for (i in myFriendsToo)
        println(i)
}

fun sum(){
    var sum: Int = 0
    for (num in 1 until 11){
        println("Please enter num$num: ")
        sum +=  readLine().toString().toInt()
    }
    println("The sum is $sum")
}
