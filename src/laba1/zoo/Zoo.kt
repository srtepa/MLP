package laba1.zoo

import laba1.animals.AbstractAnimal
import laba1.people.Viewer
import kotlin.random.Random

//класс зоопарка с первичным конструктором
class Zoo(var name: String, var capacity: Int) {
    private var animals = ArrayList<AbstractAnimal>()

    fun acceptViewer(viewer: Viewer){//принятие посетителя с выдачей животного
        println("$name сейчас выдаст животное для просмотра зрителю ${viewer.name}...")
        val animal = giveAnimal()
        viewer.viewAnimal(animal)
    }

    private fun giveAnimal(): AbstractAnimal{
        if (animals.isEmpty()) {
            throw IllegalStateException("В $name нет животных!")
        }

        var randomIndex = Random.nextInt(0, animals.size)

        return animals[randomIndex]
    }

    fun addAnimal(animal: AbstractAnimal) {//добавление животного в зоопарк
        if(animals.size==capacity) return

        animals.add(animal)
    }


}