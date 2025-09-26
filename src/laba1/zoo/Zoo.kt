package laba1.zoo

import laba1.animals.AbstractAnimal
import laba1.people.Viewer
import kotlin.random.Random

class Zoo(var name: String, var capacity: Int) {
    private var animals = ArrayList<AbstractAnimal>()

    fun acceptViewer(viewer: Viewer){
        println("Зоопарк сейчас выдаст животное для просмотра зрителю ${viewer.name}...")
        val animal = giveAnimal()
        viewer.viewAnimal(animal)
    }

    private fun giveAnimal(): AbstractAnimal{
        if (animals.isEmpty()) {
            throw IllegalStateException("В зоопарке нет животных!")
        }

        var randomIndex = Random.nextInt(0, animals.size)

        return animals[randomIndex]
    }

    fun addAnimal(animal: AbstractAnimal) {
        if(animals.size==capacity) return

        animals.add(animal)
    }


}