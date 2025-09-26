package laba1.animals.mammals

class Elephant: AbstractMammal {
    var type = "Слон"
    private var name: String
    private var age: Int
    private var numOfRoom: Int
    private var trunk: String

    constructor(name: String, age: Int, body: String, paws: String, trunk: String, numOfRoom: Int) : super(body, paws){
        this.trunk=trunk
        this.age=age
        this.name=name
        this.numOfRoom=numOfRoom
    }

    override fun eat(): String {
        return "Слон ест!"
    }

    override fun getInfo(): String {
        return """
            животное: слон
                имя: $name
                возраст: $age
                тело: $body
                лапы: $paws
                хобот: $trunk
                номер вольера: $numOfRoom
        """.trimIndent()
    }
}