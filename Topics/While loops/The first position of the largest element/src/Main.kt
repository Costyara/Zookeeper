import java.util.Scanner

fun main() {
    val listOfNumber = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        listOfNumber.add(num)
    }
    val max: Int? = listOfNumber.maxOrNull()
    val indexOfMax = listOfNumber.indexOf(max) + 1
    println("$max $indexOfMax")
}