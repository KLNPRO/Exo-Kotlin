class Complex(var reel: Double= 0.0, var image: Double=0.0)


fun main() {
    val number1 = Complex()
    number1.reel = 5.0
    number1.image = 2.0
    println(number1.reel)
    println(number1.image)
}