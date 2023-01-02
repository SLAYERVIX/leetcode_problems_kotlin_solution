package x771_jewels_and_stones
fun numJewelsInStones(jewels: String, stones: String): Int {
    var x = 0
    stones.forEach {
        if (jewels.contains(it)) {
            x++
        }
    }
    return x
}
fun main() {
    println(numJewelsInStones("aw","aaawww"))
}