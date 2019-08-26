fun main(){
    var circle1 = Circle(5)
    var circle2 = Circle(7)
    var circle3 = Circle(2)
    var circle4 = Circle(9)

    var circles = arrayOf(circle1, circle2, circle3, circle4)
    for (item in circles){
        println("The area of a circle with radius ${item.radius} is ${item.area()} ")
    }


}