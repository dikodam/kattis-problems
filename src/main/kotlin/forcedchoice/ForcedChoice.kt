package forcedchoice

fun main(args: Array<String>) {
    val (numberOfCards, secretNumber, numberOfSteps) = readLine()!!.split(" ").map { it.toInt() }

    val steps = generateSequence { readLine()!! }
        .take(numberOfSteps)
        .map(::parseStepSequence)
        .toList()

    val cards = generateSequence(1, Int::inc)
        .take(numberOfCards)
        .toMutableList()

    for (drawnCards in steps) {
        if (secretNumber in drawnCards) {
            println("KEEP")
            cards.removeIf { !drawnCards.contains(it) }
        } else {
            println("REMOVE")
            cards.removeIf { drawnCards.contains(it) }
        }
    }
}

fun parseStepSequence(stepString: String): List<Int> = stepString.split(" ").map { it.toInt() }.drop(1)


//1 2 3 4 5 6 7 8 9 10
//x 2 3 4 x 6 7 8 9 10
//x 2 3 x x x 7 8 x 10
//x x 3 x x x x 8 x xx
//x x 3 x x x x x x xx