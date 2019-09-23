package net.stackflow.kotlin.everywhere

/*
напишите расширение к Int, которое будет возвращать необходимую строку
*/
fun main(args: Array<String>) {

    fun Int.getAgeEndings(): String {
        val ageEndings = when (this % 10) {
            1 -> if (this % 100 == 11) "Лет" else "Год"
            2 -> if (this % 100 == 12) "Лет" else "Года"
            3 -> if (this % 100 == 13) "Лет" else "Года"
            4 -> if (this % 100 == 14) "Лет" else "Года"
            else -> "Лет"
        }
        return ageEndings
    }

    assert(1.getAgeEndings() == "Год")
    assert(4.getAgeEndings() == "Года")
    assert(5.getAgeEndings() == "Лет")
    assert(12.getAgeEndings() == "Лет")
    assert(21.getAgeEndings() == "Год")
    assert(42.getAgeEndings() == "Года")

    println("You are the best!")
}
