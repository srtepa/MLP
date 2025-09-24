package laba1.animals.birds

class Flamingo: AbstractBird {
    var name: String
    var age: Int
    var numOfRoom: Int

    constructor(name: String, age: Int, body: String, wings: String, numOfRoom: Int):super(body, wings){
        this.age=age
        this.name=name
        this.numOfRoom=numOfRoom
    }

    override fun eat(): String{
        return "Фламинго по имени $name ест"
    }

    override fun getInfo(): String {
        return """
            животное: фламинго
            имя: $name
            тело: $body
            крылья: $wings
            возраст: $age
            номер загона: $numOfRoom
        """.trimIndent()
    }


}