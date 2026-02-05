/*
 * ABC-044 B 美しい文字列
 * https://atcoder.jp/contests/abc044/tasks/abc044_b
 */
fun getString(): String {
    return readLine()!!
}


/*
 *
 */
fun main() {
    val S = getString().toList()

    // 文字の出現回数をカウント
    var d = mutableMapOf<Char, Int>()
    S.forEach {
        d[it] = d.getOrDefault(it, 0) + 1
    }

    // 出現回数が奇数の文字があれば"NO"
    d.forEach { (_, v) ->
        if (v % 2 != 0) {
            println("No")
            return
        }
    }
    println("Yes")
}