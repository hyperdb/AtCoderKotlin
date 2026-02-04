/*
 *
 */
fun getInt(): Int {
    return readLine()!!.toInt()
}

/*
 *
 */
fun main() {
    val N = getInt()
    val K = getInt()
    val X = getInt()
    val Y = getInt()
    // K泊以内なら単純にXを掛ける、それ以外は超過分はYを掛ける
    println(if (N < K) (N * X) else (K * X + (N - K) * Y))
}