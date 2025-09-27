package laba1.people

import laba1.animals.AbstractAnimal

class Viewer(var name: String) { //класс зрителя зоопарка с первичным конструктором
    fun viewAnimal(animal: AbstractAnimal){
        println("Зритель $name смотрит на животное:")
        println(animal.getInfo())
    }
}