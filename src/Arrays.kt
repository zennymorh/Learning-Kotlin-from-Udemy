fun main(){
    //
    val friends = arrayOf("Lisa", "Joanne", "Charlie", "April" )
    val temps: Array<Byte> = arrayOf(12, 34, 5, 76, 23, 12)
    //another way of declaring arrays are...ps, i have no idea what is going on here.
    val tempOfDays: Array<Byte> = arrayOf(10, 32, 54, 12, 98, 20, 55, 9, 4, 22, 76, 90, 87, 23)
    for ((x, y) in tempOfDays.withIndex()){
       // println("The element with the index $x is $y")
    }
    //looping through ranges
    for (i in 1..5)
        println("i = $i")
    //The until function doesn't print the last value
    for (i in 1 until 5 )
        println("i = $i")


//    var sum: Int = 0
//    for (i in tempOfDays){
//        sum += i
//    }
//    var avg = sum/tempOfDays.size
//    println("Average is $avg")

/*
   an array can contain multiple data types. Indexing starts from 0, lol.
   an array can hold repeated values
   AN ARRAY IS IMMUTABLE!!!
   declaring and initializing a variable.
   line 4 is used to specify the data type.
   Arrays are fixed */

}