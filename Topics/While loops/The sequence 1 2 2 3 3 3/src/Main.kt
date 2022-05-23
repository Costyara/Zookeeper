fun main() {
    val num = readln().toInt()
    var count = 0
    var repeatP = 1

    while (repeatP <= num) {
        repeat(repeatP) {
            println(repeatP)
            count++
            if (count == num) return
        }
        repeatP++
    }
}