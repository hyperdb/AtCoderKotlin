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
    // 等差数列の和の公式を利用
    println(N * (N + 1) / 2)
}
