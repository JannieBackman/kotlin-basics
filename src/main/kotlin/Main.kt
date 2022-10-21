fun main () {
    //val x = isEven(2)
    val y = 3
    println(y.isOdd() )

}
fun Int.isOdd() : Boolean {
 return this % 2 == 1
}
fun isEven(number: Int) : Boolean {
    return number % 2 == 0
}

