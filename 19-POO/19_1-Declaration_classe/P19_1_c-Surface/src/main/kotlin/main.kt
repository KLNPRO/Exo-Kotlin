class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(rectangle: Rectangle){
    var product = rectangle.width * rectangle.height
    print(product)

}

fun main() {
    val rectlangle = Rectangle()
    rectlangle.width = 5
    rectlangle.height = 3
    printArea(rectlangle)
}