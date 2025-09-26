package laba1.animals.birds

class Flamingo: AbstractBird {
    override var type = "Фламинго"
    private var name: String
    private var age: Int
    private var numOfRoom: Int

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