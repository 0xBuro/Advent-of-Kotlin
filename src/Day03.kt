import java.util.TreeSet

fun main() {

    fun part1(input: List<String>): Int {
        return input.map {
            it.substring(0..it.length / 2) to it.substring(it.length / 2 until it.length) }
            .map { (firstHalf, secondHalf) ->
            firstHalf.toSet().intersect(secondHalf.toSet()).first() }
            .map { 1 + if (it.isUpperCase()) it - 'A' + 26  else it - 'a' }
            .sumOf { it }
    }

    fun part2(input: List<String>): Int {
        return input.windowed(3, 3) { (r1, r2, r3)  ->
        r1.toSet().intersect(r2.toSet()).intersect(r3.toSet()).first() }
            .map { 1 + if(it.isUpperCase()) it - 'A' + 26 else it - 'a' }
            .sumOf { it }
    }


    //val testInput = readInputAsListOfString("rucksack")
    //check(part1(testInput) == 157)
    //check(part2(testInput) == 70)

    val input = readInputAsListOfString("rucksack")
    println(part1(input))
    println(part2(input))
}