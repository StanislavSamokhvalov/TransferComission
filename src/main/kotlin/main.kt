const val PERCENT = 0.0075
const val MIN_COMISSION = 3500

fun main() {
    print("Enter the transfer amount (in kopek): ")
    val amount = readLine()!!.toInt()
    val commission = amount * PERCENT
    val finalCommission = if (commission <= MIN_COMISSION) MIN_COMISSION else commission
    print("The transfer amount will be (in kopek): $finalCommission")
}
