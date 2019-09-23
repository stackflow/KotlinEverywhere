package net.stackflow.kotlin.everywhere

/*
напишите функцию, которая использует функцию any и принимает лямбду
*/

fun main() {

    fun containsFortyTwo(list: List<Any?>): Boolean {
        return list.contains(42)
    }

    val list = listOf(1, 5, 42, 99)
    val list2 = listOf(1, 5, 41, 99)

    assert(containsFortyTwo(list) == true)
    assert(containsFortyTwo(list2) == false)

    println("You are the best!")
}
