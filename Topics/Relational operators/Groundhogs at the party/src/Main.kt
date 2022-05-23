fun main() {
    val numberOfCups = readln().toInt()
    val weekend = readln().toBoolean()
    println(numberOfCups in 10..20 && !weekend || numberOfCups in 15..25 && weekend)
}
