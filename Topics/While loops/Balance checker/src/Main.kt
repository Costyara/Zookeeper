import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var error = false
    while (scanner.hasNextInt()) {
        val nextPrice = scanner.nextInt()
        if (nextPrice > balance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $nextPrice.")
            error = true
            break
        }
        balance -= nextPrice
    }
    if (!error) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}