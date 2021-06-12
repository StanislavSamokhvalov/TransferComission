const val PERCENT = 0.0075
const val MIN_COMISSION = 3500

fun main() {
    print("Enter the transfer amount (in kopek): ")
    val amount = readLine()!!.toInt()
    val step = MIN_COMISSION / PERCENT
    val commission = if (amount <= step) MIN_COMISSION else amount * PERCENT
    print("The transfer amount will be (in kopek): $commission")
}
