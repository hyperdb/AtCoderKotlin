/*
 * ABC-043 C - いっしょ
 * https://atcoder.jp/contests/abc043/tasks/arc059_a
 */
fun getInt(): Int {
    return readLine()!!.toInt()
}

fun getIntList(): List<Int> {
    return readLine()!!.split(" ").map{it.toInt()}
}
// 指定値に合わせるコストを計算
fun getCost(data: List<Int>, average: Int) : Int {
    var cost = 0
    for (a in data) {
        // Math.powだとDoubleになるので単純に計算
        cost += (a - average) * (a - average)
    }
    return cost
}

/*
 *
 */
fun main() {
    val N = getInt()

    if (N > 0) {
        val A = getIntList()
        val average = A.average()

        var cost = Int.MAX_VALUE
        // 平均が整数なら単純にコストを計算
        if (average % 1.0 == 0.0) {
            cost = getCost(A, average.toInt())
        } else {
            // 平均が整数でないなら切り上げと切り下げの両方を試す
            cost = minOf(
                getCost(A, Math.floor(average).toInt()),
                getCost(A, Math.ceil(average).toInt())
            )
        }
        println(cost)
    } else {
        // N=0のときはコスト0
        println(0)
    }
}