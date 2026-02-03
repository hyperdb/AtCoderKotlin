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

fun getCost(data: List<Int>, average: Int) : Int {
    var cost = 0
    for (a in data) {
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
        if (average % 1.0 == 0.0) {
            cost = getCost(A, average.toInt())
        } else {
            cost = minOf(
                getCost(A, Math.floor(average).toInt()),
                getCost(A, Math.ceil(average).toInt())
            )
        }
        println(cost)
    } else {
        println(0)
    }
}