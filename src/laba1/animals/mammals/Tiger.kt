package laba1.animals.mammals

class Tiger : AbstractMammal {
    private var stripes = "Полосы на шерсти"

    constructor(body : String, paws : String) : super(body, paws){
        this.body=body
        this.paws=paws
    }

    override fun eat(): String {
        return "Тигр есть!"
    }

    override fun getInfo(): String {
        return """
            Информация о тигре:
            тело: $body
            лапы: $paws
            полосы: $stripes
        """.trimIndent()
    }
}