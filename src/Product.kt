class Product (var category:categories, var name: String, var price: Double, var discountPercent: Byte) {


    fun calcFinalPrice():Double{
        val discount = price * (discountPercent / 100)
        val finalPrice = price - discount
        return finalPrice
    }
}
/*
*** we initialized it all to zero and empty strings cause a class is like a template
*** Constructors are like functions that are called when the object of the class is declared.
*** A primary constructor is declared at the class header.
*/
