/*
 *
 */
fun getIntList(): List<Int> {
    return readLine()!!.split(" ").map{it.toInt()}
}

fun getStringRow(N: Int): List<String> {
    return List(N) { readLine()!! }
}
/*
 *
 */
fun main() {
    val (N, L) = getIntList()
    val S = getStringRow(N)

    println(S.sorted().joinToString(""))
}
