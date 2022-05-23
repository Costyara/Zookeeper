fun main() {
    var num = readln().toInt()
    if (num % 2 == 0) {
        num += 2
    } else {
        num += 1
    }
    println(num)
}