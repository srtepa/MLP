package laba1.people

import laba1.animals.AbstractAnimal


class Worker(private var name: String, private var age: Int, private var experience: Int) {
    fun getInfo(){
        println("Информация о сотруднике:\n\tимя: $name\n\tвозраст: $age\n\tопыт работы: $experience")
    }

    fun feedAnimal(animal: AbstractAnimal){
        println("Работник $name кормит животное ${animal.type}")
    }

    fun cleanCage(animal: AbstractAnimal) {
        println("Работник $name убирает клетку у животного ${animal.type}")
    }
}