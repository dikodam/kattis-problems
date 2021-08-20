package tarifa

fun main(args: Array<String>) {
    val monthlyRate = readLine()!!.toInt()
    val monthAmount = readLine()!!.toInt()
    val monthlyConsumptions = generateSequence { readLine()!!.toInt() }
        .take(monthAmount)
        .toList()

    val theoreticalMaxBalance = monthlyRate * (monthAmount + 1)
    val actualBalance = monthlyConsumptions.fold(theoreticalMaxBalance) { acc, consump -> acc - consump }
    println(actualBalance)
}