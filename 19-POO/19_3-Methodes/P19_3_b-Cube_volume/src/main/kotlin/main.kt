class Box(var height: Double, var width: Double, var length: Double) {

    fun getVolume(): Double {
        var Volume: Double = height * width * length

        return Volume
    }
}



fun main() {
    val myBox = Box(10.0, 20.0, 50.0)
    println(myBox.getVolume())
}