import java.lang.Integer.*
fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val minValue = min(num3, num2)
    val maxValue = max(num3, num2)
    println(num1 in minValue..maxValue)
}