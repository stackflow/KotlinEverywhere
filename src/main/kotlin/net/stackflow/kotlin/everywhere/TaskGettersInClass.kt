package net.stackflow.kotlin.everywhere

/*
создайте класс, который содержит три поля. Два из них можно менять, а третье равняется произведению первых двух. Используйте Getters.
*/

class ProblemsMultiplier() {
    var multiplier: Int = 0
    var amountOfProblemsBefore: Int = 0
    val amountOfProblemsNow: Int
        get() {
            return multiplier * amountOfProblemsBefore
        }
}

fun main(args: Array<String>) {

    val pm = ProblemsMultiplier()

    pm.multiplier = 2
    pm.amountOfProblemsBefore = 5
    assert(pm.amountOfProblemsNow == 10)

    pm.multiplier = 2
    pm.amountOfProblemsBefore = 10
    assert(pm.amountOfProblemsNow == 20)

    println("You are the best!")
}
