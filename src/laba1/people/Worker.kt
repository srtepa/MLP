package laba1.people
import laba1.animals.AbstractAnimal

class Worker {
    var name: String
    var age: Int
    var experience: Double

    constructor(name: String, age: Int, experience: Double){
        this.name=name
        this.age=age
        this.experience=experience
    }

    fun getInfo(){
        println("Информация о сотруднике:\n имя: $name\nвозраст: $age\n опыт работы: $experience")
    }

}