package laba1.people

import laba1.animals.AbstractAnimal

class Viewer(var name: String) {
    fun viewAnimal(animal: AbstractAnimal){
        println("Зритель $name смотрит на животное:")
        animal.getInfo()
    }
}