fun main(){
    //OOP has four major principles;Encapsulation, Abstraction, Inheritance, Polymorphism
    //this is how to declare an object or instance
    var product1 = Product( categories.Electronic, "PES 2019",200.0, 5 )
    var product2 = Product(categories.Utensils, "Fast 3000", 567.0, 9)
    var product3 = Product(categories.Electronic, "Blue Rotunda 2", 1090.0, 23)

    var products = arrayOf(product1, product2, product3)
    for (item in products){
        println("The final price of ${item.name} is ${item.calcFinalPrice()}")
    }

    //accessing the variables and functions stored in an object.
    //This block of code was commented out cause I have replaced them with constructors
   /* product1.category = "Electronics"
    product1.name = "PES 2019"
    product1.price = 200.0
    product1.discountPercent = 5*/


    //a variable declared within a class is called a property
    //a function declared within a class is called a mentor

    //The idea of a class is to 'encapsulate' related variables and functions that work on those variables into a single entity.

}