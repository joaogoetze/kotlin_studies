open class Person(name: String, dream: String, bornYear: Int) {

    //Indicam os atributos do objeto instanciado
    var name: String = ""
    var dream: String = ""
    var bornYear: Int = 0

    //Adiciona os atributos passados na instância
    init {
        this.name = name
        this.dream = dream
        this.bornYear = bornYear
    }

    fun walk(){
        println("walked");
    }

    // Apenas classes filhas podem acessar e a própria classe podem acessar
    protected fun cry(){
        println("I'm crying")
    }

    //Constantes que podem ser acessadas em qualquer lugar do código
    companion object {
        const val testName = "joão"
    }


}