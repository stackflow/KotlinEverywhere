package net.stackflow.kotlin.everywhere

/*
напишите расширение к строке
*/

fun main() {

    fun String.reverseAndToCapital() = this.toUpperCase().reversed()

    assert("String".reverseAndToCapital() == "GNIRTS")

    println("You are the best!")
}
