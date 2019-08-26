import kotlin.math.PI

class Circle (var radius:Byte){

    var pie = PI

    fun area():Double{
        var area = pie * radius * radius
        return area
    }
}