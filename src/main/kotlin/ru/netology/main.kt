package ru.netology

const val MASTERCARD = "MasterCard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VK_PAY = "VK Pay"

const val COMMISSION_M = 0.6
const val COMMISSION_M_RUB = 2000

const val COMMISSION_V_M = 0.75
const val MIN_COMMISSION_V_M_RUB = 3500

fun main() {
    val amount = 1005009
    val cards1 = MAESTRO
    val cards2 = MIR

    println("Перевод картой '$cards1', коммиссия ${commission(amount, cards1)} копеек")
    println("В рублях ${convectorInRubles(commission(amount, cards1))}")
    println("Перевод картой '$cards2', коммиссия ${commission(amount, cards2)} копеек")
    println("В рублях ${convectorInRubles(commission(amount, cards2))}")
    println("Перевод картой '$VK_PAY', коммиссия ${commission(amount)} копеек")

}

// Высчитывает комиссию
fun commission(amount: Int = 0, cards: String = VK_PAY): Int = when (cards) {
    MASTERCARD, MAESTRO -> masterMaestro(amount)
    VISA, MIR -> visaMir(amount)
    else -> 0
}

// Комиссия MasterCard и Maestro
fun masterMaestro(amount: Int): Int {
    return (amount * COMMISSION_M / 100).toInt() + COMMISSION_M_RUB
}

// Комиссия Visa и Mир
fun visaMir(amount: Int): Int {
    val result = (amount * COMMISSION_V_M / 100).toInt()
    return if (result > MIN_COMMISSION_V_M_RUB) {
        result
    } else {
        MIN_COMMISSION_V_M_RUB
    }
}

// Конвектор в рубли и копейки
fun convectorInRubles(amount: Int): String {
    val ruble = (amount / 100)
    val penny = amount % 100

    return "$ruble руб. $penny коп."
}

