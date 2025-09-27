package laba1

import laba1.animals.mammals.Elephant
import laba1.animals.birds.Ostrich
import laba1.people.Worker
import laba1.people.Viewer
import laba1.zoo.Zoo

fun main() {
    val zoo = Zoo("Минский зоопарк", 10) //создаем зоопарк

    val worker = Worker("Иван", 30, 5)//создаем работника и животных
    val elephant = Elephant("Боб", 15, "Большое тело", "Толстые лапы", "Длинный хобот", 1)
    val ostrich = Ostrich("Оскар", 5, "Длинная шея", "Крылья", 3)

    zoo.addAnimal(elephant)
    zoo.addAnimal(ostrich)

    val viewer = Viewer("Алиса")

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
    println(elephant.returnThanks())
    println()

    worker.cleanCage(ostrich)
    println(ostrich.returnThanks())
    println()
}