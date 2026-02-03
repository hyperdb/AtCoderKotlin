/*
 * ABC-042 A - 和風いろはちゃんイージー
 * https://atcoder.jp/contests/abc042/tasks/abc042_a
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
