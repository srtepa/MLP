package laba1.animals

abstract class AbstractAnimal {//создаем абстрактный класс
    protected var body: String
    open var type = "Неопределенное животное"

    constructor(){//создаем конструктора класса
        this.body = "Неопределенное животное"
    }

    constructor(body: String){
        this.body=body
    }

    //объявляем абстрактные ф-ции
    abstract fun eat(): String
    abstract fun getInfo(): String
    abstract fun returnThanks(): String
}