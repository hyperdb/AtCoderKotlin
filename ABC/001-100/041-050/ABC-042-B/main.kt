/*
 * ABC-042 B - 文字列大好きいろはちゃんイージー
 * https://atcoder.jp/contests/abc042/tasks/abc042_b
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
    // ソートして結合
    println(S.sorted().joinToString(""))
}
