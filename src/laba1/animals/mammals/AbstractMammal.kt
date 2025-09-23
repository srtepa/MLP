package laba1.animals.mammals
import laba1.animals.AbstractAnimal

abstract class AbstractMammal : AbstractAnimal {
    protected var paws : String

    constructor(body : String, paws : String) : super(body){
        this.paws=paws
    }
}