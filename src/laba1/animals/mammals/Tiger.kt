package laba1.animals.mammals

class Tiger : AbstractMammal {
    override var type = "Тигр"//поля класса
    private var name: String
    private var age: Int
    private var numOfRoom: Int
    private var stripes = "Полосы на шерсти"

    //вторичный конструктор класса
    constructor(name: String, age: Int, body : String, paws : String, numOfRoom: Int) : super(body, paws){
        this.body=body
        this.paws=paws
        this.age=age
        this.name=name
        this.numOfRoom=numOfRoom
    }

    //переопред. ф-ции
    override fun eat(): String {
        return "Тигр $name ест!"
    }

    override fun getInfo(): String {
        return """
            Информация о тигре:
                имя: $name
                возраст: $age
                тело: $body
                лапы: $paws
                полосы: $stripes
                номер вольера: $numOfRoom
        """.trimIndent()
    }

    override fun returnThanks(): String {
        return "Тигр $name благодарит работника!"
    }
}