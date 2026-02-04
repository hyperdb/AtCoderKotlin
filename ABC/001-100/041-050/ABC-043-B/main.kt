/*
 * ABC-043 B - バイナリハックイージー
 * https://atcoder.jp/contests/abc043/tasks/abc043_b
 */
fun getString(): String {
    return readLine()!!
}

/*
 *
 */
fun main() {
    val S = getString()

    S.toList().let {
        val result = StringBuilder()
        for (c in it) {
            // 文字に応じて処理を分岐
            when (c) {
                '0' -> result.append('0')
                '1' -> result.append('1')
                // 空の時は処理しない
                'B' -> if (result.isNotEmpty()) result.deleteCharAt(result.length - 1)
            }
        }
        println(result.toString())
    }

}