package ofugsnuid

fun main(args: Array<String>) {
    val numberCount = readLine()!!.toInt()
    val numbers = generateSequence { readLine()!!.toInt() }
        .take(numberCount)
        .toList()
    val numbersReversedAsString = numbers.asReversed().joinToString(separator = "\n")
    println(numbersReversedAsString)

}
