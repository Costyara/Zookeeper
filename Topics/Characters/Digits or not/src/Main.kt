fun main() {
    val numbers1 = mutableListOf<Int>(1, 2, 3, 4)
    val numbers2 = mutableListOf<Int>(1, 2, 3, 4)
    val numbers3 = mutableListOf<Int>(4, 3, 2, 1)
    val numbers4 = mutableListOf<Int>(1, 2, 3)

    val a = numbers4 == numbers2

    val b = numbers1 == numbers2

    val c = numbers2 == numbers3

    val d = numbers1 == numbers1

}