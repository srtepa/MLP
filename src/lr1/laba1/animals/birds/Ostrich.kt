package laba1.animals.birds

class Ostrich: AbstractBird {
    override var type = "Страус"//поля класса
    private var name: String
    private var age: Int
    private var numOfRoom: Int
    private var runSpeed: String = "Очень быстро бегает"

    constructor(name: String, age: Int, body: String, wings: String, numOfRoom: Int):super(body, wings){ //вторичный конструктор
        this.age=age
        this.name=name
        this.numOfRoom=numOfRoom
    }

    override fun eat(): String{//переопределяем абс. ф-ции
        return "Страус $name ест мелких насекомых"
    }

    override fun getInfo(): String {
        return """
            животное: страус
                имя: $name
                тело: $body
                крылья: $wings (не летает)
                возраст: $age
                номер загона: $numOfRoom
                скорость бега: $runSpeed
        """.trimIndent()
    }

    override fun returnThanks(): String {
        return "Страус $name благодарит работника!"
    }
}