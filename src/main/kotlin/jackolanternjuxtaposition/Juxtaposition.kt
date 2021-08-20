package jackolanternjuxtaposition

fun main(args: Array<String>) {
    // 3 4 5
    val input = readLine()!!
    input.split(Regex(" "))
        .map { it.toInt() }
        .reduce(Int::times)
        .also { print(it) }
}