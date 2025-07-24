class Person(name: String, dream: String) {

    //Indicam os atributos do objeto instanciado
    var name: String = ""
    var dream: String = ""

    //Adiciona os atributos passados na instância
    init {
        this.name = name
        this.dream = dream
    }

    fun walk(){
        println("walked");
    }
}