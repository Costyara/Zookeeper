fun main() {
    val num = readln().toInt()
    val sumOfNum = (num / 100) + (num / 10 % 10) + (num % 10)
    println(sumOfNum)
}