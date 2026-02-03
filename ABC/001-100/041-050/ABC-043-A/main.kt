/*
 * ABC043 A - キャンディーとN人の子供イージー
 * https://atcoder.jp/contests/abc043/tasks/abc043_a
 */
fun getInt(): Int {
    return readLine()!!.toInt()
}
/*
 *
 */
fun main() {
    val N = getInt()

    println(N * (N + 1) / 2)
}
