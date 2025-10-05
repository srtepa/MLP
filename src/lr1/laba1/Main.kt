package laba1

import laba1.animals.mammals.Elephant
import laba1.animals.birds.Ostrich
import laba1.people.Worker
import laba1.people.Viewer
import laba1.zoo.Zoo

fun main() {
    val zoo = Zoo() //создаем зоопарк

    val worker = Worker()//создаем работника и животных
    val elephant = Elephant("Большое тело", "Толстые лапы", "Длинный хобот")
    val ostrich = Ostrich("Длинная шея", "Крылья")

    zoo.addAnimal(elephant)
    zoo.addAnimal(ostrich)

    val viewer = Viewer()

    //реализовываем диаграмму последовательностей
    println("Зритель хочет посмотреть на животное...")
    zoo.acceptViewer(viewer)
    println()

    worker.feedAnimal(elephant)
    println(elephant.eat())
    println(elephant.returnThanks())
    println()

    worker.feedAnimal(ostrich)
    println(ostrich.eat())
    println(ostrich.returnThanks())
    println()

    worker.cleanCage(elephant)
    println()

    worker.cleanCage(ostrich)
    println()
}