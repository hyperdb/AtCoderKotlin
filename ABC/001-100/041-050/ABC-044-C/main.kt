/*
 * ABC-044 C - 高橋君とカード
 * https://atcoder.jp/contests/abc044/tasks/arc060_a
 */
fun getIntList(): List<Int> {
    return readLine()!!.split(" ").map {
        it.toInt()
    }
}


/*
 *
 */
fun main() {
    val (N, A) = getIntList()
    val x = getIntList()
    // DPテーブルを初期化
    var dp = Array(N + 1) { Array(N * 50 + 1) { LongArray(N + 1) { 0L } } }
    // ベースケースを設定
    dp[0][0][0] = 1L
    // DPテーブルを更新
    for (i in 0 until N) {
        for (j in 0..x.sum()) {
            for (k in 0 until N) {
                if (dp[i][j][k] == 0L) continue
                else {
                    dp[i + 1][j][k] += dp[i][j][k]
                    dp[i + 1][j + x[i]][k + 1] += dp[i][j][k]
                }
            }
        }
    }
    // 結果を計算
    var ans = 0L
    for (k in 1..N) {
        ans += dp[N][k * A][k]
    }
    println(ans)
}
