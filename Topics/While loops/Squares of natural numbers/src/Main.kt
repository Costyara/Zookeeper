fun main() {
    val num = readln().toInt()
    var n = 1
    while (n * n <= num) {
        println(n * n)
        n++
    }
}