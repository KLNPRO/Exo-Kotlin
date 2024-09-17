fun isVowel(letter:Char):Boolean {
    if (letter.isLetter()){
        return true
    } else {
        return false
    }
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
