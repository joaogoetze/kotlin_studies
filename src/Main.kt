import Person.Companion.testName

const val jhonson = "jhonson" // Forma de ter uma constante que pode ser acessada em todo o código

fun main(args: Array<String>) {


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

//    val lil_dude = Children("João", "??????", "ball")
//    lil_dude.play()
//    lil_dude.figth()
//    println(lil_dude.fav_toy)
//    println(testName) //Está definido em Person.kt



    //List -> Imutável - tamanho fixo, apenas para leitura
    // ArrayList -> Mutável - Sem tamanho fixo, pode adicionar novos itens ou remover
    //MutableList -> Mutável, sem Tamanho fixo, pode adicionar novos itens ou remover

    //List
//    val moviesList = listOf("Titanic", "ozy")
//    println(moviesList)

    //ArrayList
//    var moviesList2 = arrayListOf("Titanic", "ozy")
//    println(moviesList2)
//    moviesList2.add("ticprow")
//    println(moviesList2)
//    moviesList2.remove("ozy")
//    println(moviesList2)
//    moviesList2[0] = "homiranha"
//    println(moviesList2)
//    println(moviesList2.isEmpty())
//
//    println(moviesList2.contains("homiranha"))
//
//
//    var personList: MutableList<NewPerson> = mutableListOf(
//        NewPerson("Jão",  2003),
//        NewPerson("Giovanna", 2002),
//        NewPerson("Nathi", 2011)
//    )
//
//    //Filtros
//    println(personList.filter {
//        it.born!! > 2005
//    })


    //Mutable List é igual ArrayList

//    //Ordenar listas - crescente e decrescente
//    val numbersList = mutableListOf(1,3,2,6,4)
//    numbersList.sort()
//    println(numbersList)
//
//    val numbersList2 = mutableListOf(6,5,23,4,5)
//    numbersList2.sortDescending()
//    println(numbersList2)

//Hashmap

//    val carMap = hashMapOf(
//        "model" to "palio",
//        "year" to 2002
//    )
//
//    val model = carMap.get("model")
//    println(model)


    //Funções dentro de variáveis

//    val usero = User()
//    val user = usero.user("João", 22)
//    println(user)

    //LEt
//    val personList: MutableList<NewPerson> = mutableListOf(
//        NewPerson("João", 2003),
//        NewPerson("Jorge", 2004),
//        NewPerson("Janio", 2005)
//    )
//
//    personList.let { it ->
//        val personsMap = hashMapOf(
//            "list" to it
//        )
//
//        println(personsMap.get("list"))
//    }

// Foreach
//    val array = arrayOf("Rice", "Meet", "Apple")
//
//    array.forEach { it -> println(it) }

//Elviz operator

//  val user = NewPerson(name = "João")
//  val user1 = NewPerson(name = null)
//
//    // Se o nome do usuário for nulo, a variável recebe o texto
//    val nome = user1.name ?: "Usuário sem nome"
//
//    print(nome)

    //Funções anonimas
//    fun register(serverResponse : (String, Boolean) -> Unit){
//        serverResponse("user registred sucessfuly", false)
//    }
//
//    register { msg, validate ->
//        if(validate) {
//            println(msg)
//        } else {
//            println("Erro cadastro")
//        }
//    }

}