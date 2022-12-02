fun main() {

    fun elfNotes(input: String): List<List<Int>> {
        return input.split("\n\n")
            .map { singleElf -> singleElf.lines()
                .map { it.toInt() } }
    }

    fun part1(input: String): Int {
        val elvesCarry = elfNotes(input)
        return elvesCarry.maxOf { it.sum() }

    }

    fun part2(input: String): Int {
        val elvesCarry = elfNotes(input)
        return elvesCarry
            .map { it.sum() }
            .sortedDescending()
            .take(3)
            .sum()
    }

    //val testInput = readInput("input")
    //check(part1(testInput) == 24000)

    val input = readInput("input")
    println(part1(input))
    println(part2(input))
}
