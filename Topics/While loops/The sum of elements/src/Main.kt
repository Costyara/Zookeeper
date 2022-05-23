import java.util.Scanner

fun main() {
    var summ = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        if (num == 0) {
            println(summ)
            return
        }
        summ += num
    }
}