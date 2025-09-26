package laba1.animals

abstract class AbstractAnimal {
    protected var body: String
    var type = "Неопределенное животное"

    constructor(){
        this.body = "Неопределенное животное"
    }

    constructor(body: String){
        this.body=body
    }

    abstract fun eat(): String
    abstract fun getInfo(): String
}