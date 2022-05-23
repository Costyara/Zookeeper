fun main() {
    print(
        listOf(readln().toInt(), readln().toInt(), readln().toInt()).sumOf { it ->
            it / 2 + it % 2
        }
    )
}
