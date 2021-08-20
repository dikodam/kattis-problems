package modulo

fun main(args: Array<String>) {
    // take 10 positive integers
    // divide each modulo 42
    // count the distinct remainders
    generateSequence { readLine()!!.toInt() }
        .take(10)
        .map { it % 42 }
        .distinct()
        .count()
        .also { println(it) }
}