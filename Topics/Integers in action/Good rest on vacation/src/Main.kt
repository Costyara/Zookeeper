fun main() {
    val days = readln().toInt()
    val foodCost = readln().toInt() * days
    val flightsCost = readln().toInt() * 2
    val costOfAllNights = readln().toInt() * (days - 1)
    println(foodCost + flightsCost + costOfAllNights)
}