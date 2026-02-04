/*
 * ABC-042 C - こだわり者いろはちゃん
 * https://atcoder.jp/contests/abc042/tasks/arc058_a
 */
fun getIntList(): List<Int> {
    return readLine()!!.split(" ").map{it.toInt()}
}

/*
 *
 */
fun main() {
    val (N, K) = getIntList()
    val D = getIntList()
    // Nから順に調べる
    for (n in N..100000) {
        var check = true
        val digits = n.toString().toList()
        // 1文字ずつ嫌いな数字リストに含まれるか確認
        digits.map{it.toString().toInt()}.let {
            for (d in it) {
                if (d in D) {
                    check = false
                    return@let
                }
            }
        }
        if (check) {
            println(n)
            return
        }
    }
}