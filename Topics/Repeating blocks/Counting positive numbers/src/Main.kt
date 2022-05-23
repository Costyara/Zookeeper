fun main() {
    val times = readln().toInt()
    var positiveNum = 0
    repeat(times) {
        val num = readln().toInt()
        if (num > 0) positiveNum++
    }
    println(positiveNum)
}