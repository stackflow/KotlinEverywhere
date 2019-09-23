package net.stackflow.kotlin.everywhere

import java.util.Collections

fun getSortedList(list:List<String>): List<String> {
    Collections.sort(list, object : Comparator<String> {
        override fun compare(x: String, y: String) = x.first() - y.first()
    } )
    return list
}

fun main(args: Array<String>) {

    val list = listOf("kotlin","java", "apocalypse")

    assert(getSortedList(list) == listOf("apocalypse","java", "kotlin"))

    println("You are the best!")
}
