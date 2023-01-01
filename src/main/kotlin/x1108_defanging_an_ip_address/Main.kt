package x1108_defanging_an_ip_address

fun defangIPaddr(address: String): String {
    val x : StringBuilder = StringBuilder()
    address.forEach {
        if (it == '.') {
            x.append("[.]")
        } else {
            x.append(it)
        }
    }
    return x.toString()
}

fun main() {
    println(defangIPaddr("1.1.1.1"))
}