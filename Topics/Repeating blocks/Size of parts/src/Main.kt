fun main() {
    val standard = 0
    var larger = 0
    var smaller = 0
    var perfect = 0
    val n = readln().toInt()
    repeat(n) {
        val size = readln().toInt()
        if (size > standard) larger++
        else if (size < standard) smaller++
        else if (size == standard) perfect++
    }
    println("$perfect $larger $smaller")
}