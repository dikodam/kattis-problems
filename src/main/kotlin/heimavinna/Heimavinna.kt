package heimavinna

fun main(args: Array<String>) {
    // 1-3;5;7;10-13
    val input = readLine()!!
    if ("" == input) {
        println(1)
        return
    }
    input.split(Regex(";"))
        .flatMap { rangeString -> resolveRange(rangeString) }
        .distinct()
        .count()
        .also(::println)
}

fun resolveRange(rangeString: String): IntRange {
    return if (rangeString.contains("-")) {
        val (start, end) = rangeString.split("-")
            .map { it.toInt() }
        start until end + 1
    } else {
        val number = rangeString.toInt()
        number until number + 1
    }
}