package x1929_concatination_of_array
fun getConcatenation(nums: IntArray): IntArray {
    val x = mutableListOf<Int>()

    x.addAll(nums.toList())
    x.addAll(nums.toList())

    return x.toIntArray()
}
fun main() {
    println(getConcatenation(intArrayOf(12,2,1)))
}