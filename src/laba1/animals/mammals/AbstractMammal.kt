package animals.mammals
import animals.AbstractAnimal

abstract class AbstractMammal : AbstractAnimal {
    protected var paws : String

    constructor(body : String, paws : String) : super(body){
        this.paws=paws
    }
}