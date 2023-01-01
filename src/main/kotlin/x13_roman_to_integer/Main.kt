package x13_roman_to_integer
fun romanToInt(s: String): Int {
    var total = 0
    var current = 0
    var previous = 1000
    s.forEach {
        when (it) {
            'I' -> current = 1
            'V' -> current = 5
            'X' -> current = 10
            'L' -> current = 50
            'C' -> current = 100
            'D' -> current = 500
            'M' -> current = 1000
        }

        if (current <= previous) {
            total += current
            previous = current
        }
        else {
            total -= previous
            current -= previous
            total += current
        }
    }
    return total
}
fun main() {
    println(romanToInt("MCMXCIV"))
}