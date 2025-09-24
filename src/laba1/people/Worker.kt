package laba1.people


class Worker {
    private var name: String
    private var age: Int
    private var experience: Int

    constructor(name: String, age: Int, experience: Int){
        this.name=name
        this.age=age
        this.experience=experience
    }

    fun getInfo(){
        println("Информация о сотруднике:\n\tимя: $name\n\tвозраст: $age\n\tопыт работы: $experience")
    }

}