package laba1

import laba1.animals.mammals.Elephant
import laba1.animals.mammals.Tiger
import laba1.animals.birds.Ostrich
import laba1.animals.birds.Flamingo
import laba1.people.Worker
import laba1.people.Viewer
import laba1.zoo.Zoo

fun main() {
    val zoo = Zoo("Минский зоопарк", 10)

    val elephant = Elephant("Боб", 15, "Большое тело", "Толстые лапы", "Длинный хобот", 1)
    val tiger = Tiger("Шерхан", 8, "Мощное тело", "Острые когти", 2)
    val ostrich = Ostrich("Оскар", 5, "Длинная шея", "Крылья", 3)
    val flamingo = Flamingo("Флами", 3, "Изящное тело", "Длинные крылья", 4)

    zoo.addAnimal(elephant)
    zoo.addAnimal(tiger)
    zoo.addAnimal(ostrich)
    zoo.addAnimal(flamingo)

    val worker = Worker("Иван", 30, 5)

    worker.feedAnimal(elephant)
    println(elephant.eat())
    println()

    worker.feedAnimal(tiger)
    println(tiger.eat())
    println()

    worker.feedAnimal(ostrich)
    println(ostrich.eat())
    println()

    worker.feedAnimal(flamingo)
    println(flamingo.eat())
    println()

    worker.cleanCage(tiger)
    println()

    val viewer = Viewer("Алиса")

    zoo.acceptViewer(viewer)

    viewer.viewAnimal(elephant)
}