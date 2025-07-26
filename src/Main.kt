fun main() {
    //print
    //println("Oi")

    //Variáveis
    // Variável mutável
    //var name = "João"
    //name = "Giovanna" // Funciona
    // Variável imutável
    //val name2 = "João"
    //name2 = "Giovanna" // Não funciona

    //Fixar tipo de variável
    // Setando name como string
    //var name: String
    //name = 1 // Não funciona
    //var name2
    //name2 = 1 // Funciona

    //For
    //val numbers = listOf(1,2,3)
    //for(i in numbers){
    //    println(i);
    //}

    //for (i in 1..5) {
    //    println(i)
    //}

    //While
    //var i = 0
    //while (i<5){
    //    println(i)
    //    i++
    //}

    //When
    //var option = 5
    //when(option) {
    //    1 -> println("Fist option")
    //    2 -> println("Second option")
    //    else -> println("Default option")
    //}

    //val dude = Person("João", "??????")
    //dude.walk()
    //println(dude.name)

    val lil_dude = Children("João", "??????", "ball")
    lil_dude.play()
    lil_dude.figth()
    println(lil_dude.fav_toy)
}