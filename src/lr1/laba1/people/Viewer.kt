package laba1.people

import laba1.animals.AbstractAnimal

class Viewer { //класс зрителя зоопарка с первичным конструктором
    fun viewAnimal(animal: AbstractAnimal){
        println("Зритель смотрит на животное:")
        println(animal.getInfo())
    }
}