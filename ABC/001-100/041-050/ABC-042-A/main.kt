/*
 *
 */
fun getIntList(): List<Int> {
    return readLine()!!.split(" ").map{it.toInt()}
}

/*
 *
 */
fun main() {
    val abc = getIntList().sorted()

    println(if (abc == listOf(5, 5, 7)) "YES" else "NO")
}
