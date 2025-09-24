package laba1.animals.birds
import laba1.animals.AbstractAnimal

abstract class AbstractBird : AbstractAnimal {
    protected var wings : String

    constructor(body : String, wings : String ) : super(body){
        this.wings=wings
    }
}