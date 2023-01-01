package x2011_final_value_of_variable_after_performing_operation

fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0

    operations.forEach {
        if (it.contains('-')) {
            --x
        } else {
            ++x
        }
    }
    return x
}

fun main() {
    println(
        finalValueAfterOperations(arrayOf("--X", "X++", "X++"))
    )
}