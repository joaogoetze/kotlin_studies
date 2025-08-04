class Children(name: String, dream: String, bornYear: Int, fav_toy: String) : Person(name, dream, bornYear) {

    var fav_toy = ""

    init {
        this.fav_toy = fav_toy
    }

    fun play() {
        println("played")
        play_soccer()
    }

    //Só posso acessar aqui de dentro da própria classe
    private fun play_soccer() {
        println("soccer played")
    }

    fun figth(){
        cry()
    }
}