import kotlin.random.Random

fun main() {

    val op = Operaciones(5.0,7.2)
    op.suma()
    op.resta()
    println("La división es ${op.div()}")
    op.raiz(12.0)
    println("El cuadrado es ${op.cuadrado(4.0)}")

    val Operaciones = mutableListOf<Operaciones>()
    Operaciones.add(op)

    for(Operaciones){
        println(op)
    }
    println(Operaciones)

    //Implicita
    /*  var nombre = "Hola" ;
   var numero = 12;
    if(numero%2 == 0){
        println(numero)
    }else{
        println("No")
    }*/
    //Ciclo for i++ STEP para saltos
    //hacia atras down to
    //Ejercicio de FizzBuzz
    /*for(i in 1..100){
        if(i % 3 ==0 && i % 5== 0){
            println("Fizz Buzz")
        }else if (i % 3 == 0){
            println("Fizz")
        }else if (i % 5 == 0){
            println("Buzz")
        }else{
            println(i)
        }
    }*/
    /*for(i in 10 downTo 1 step 2){
        println(i)
    }
    println("Hello World!")
    println(nombre)
    var n = Int;
    n= readln.toInt()*/
    /*
    var mouse = 5200
    var teclado = 8400
    var monitor = 7900
    var discoduro = 2400
    var facturar = 0
    val iva = 0.16

    var contadorMouse = 0
    var contadorTeclado = 0
    var contadorMonitor = 0
    var contadorDiscoDuro = 0

    println("Seleccione los productos")
    println("1. Mouse")
    println("2. Teclado")
    println("3. Monitor")
    println("4. Disco duro")
    println("0. Salir")

    while (true) {
        print("Ingrese el número del producto o 5 para salir: ")
        when (readln().toInt()) {
            1 -> {
                facturar += mouse
                contadorMouse++
            }
            2 -> {
                facturar += teclado
                contadorTeclado++
            }
            3 -> {
                facturar += monitor
                contadorMonitor++
            }
            4 -> {
                facturar += discoduro
                contadorDiscoDuro++
            }
            5 -> break
            else -> println("Selección no válida")
        }
    }

    val totalIva = facturar + (facturar * iva)
    val soloIva = facturar * iva

    println("\nFactura:")
    if (contadorMouse > 0) println("Mouse x$contadorMouse: $${mouse * contadorMouse}")
    if (contadorTeclado > 0) println("Teclado x$contadorTeclado: $${teclado * contadorTeclado}")
    if (contadorMonitor > 0) println("Monitor x$contadorMonitor: $${monitor * contadorMonitor}")
    if (contadorDiscoDuro > 0) println("Disco Duro x$contadorDiscoDuro: $${discoduro * contadorDiscoDuro}")

    println("Subtotal: $$facturar")
    println("IVA 16%: $$soloIva")
    println("Total con IVA: $$totalIva") */
    /*
    var n1:Int;
    var n2:Int;
    var contadorn1 = 0
    var contadorn2 = 0

    for(i in 1 .. 5){

        n1 = Random.nextInt(10)

        n2= Random.nextInt(10)
        if(n1 > n2){
            println("Gano el n1 con $n1 ")
            n1 += contadorn1++
        }
        if(n2 > n1){
            println("Gano el n2 con $n2")
            n2 += contadorn2++
        }
        if(n1==n2){
            println("No gano ninguno")
        }
        println("El n1 lleva $contadorn1 y el n2 lleva $contadorn2");
    }
    if(contadorn1>contadorn2){
        println("Gano el n1 $contadorn1")
    }
    if(contadorn2>contadorn1){
        println("Gano el n2 con $contadorn2 rondas")
    }*/
/*
    var Piedra: Int
    var Papel: Int
    var Tijera: Int

    var jugador1= 0
    var jugador2= 0

    var contadorP1 = 0
    var contadorP2 = 0

    while (jugador1 < 2 && jugador2 < 2){

        val jugador1 = Random.nextInt(1,4)
        val jugador2 = Random.nextInt(1,4)

        if (jugador1 == jugador2) {
            println("Empate")
        } else if (
            (jugador1 == 1 && jugador2 == 3) ||
            (jugador1 == 2 && jugador2 == 1) ||
            (jugador1 == 3 && jugador2 == 2)) {
            println("Jugador 1 gana esta ronda")
            contadorP1++
        } else {
            println("Jugador 2 gana esta ronda")
            contadorP1++
        }
        println("Jugador 1: $jugador1 vs Jugador 2: $jugador2")
    }

    if (contadorP1 > contadorP2) {
        println("Jugador 1 gana el juego")
    } else {
        println("Jugador 2 gana el juego")
    }

    var jugador1= 1
    var jugador2= 1
    var jugador3= 1
    var jugador4= 1
    var jugador5= 1
    var jugador6= 1



    while (jugador1 == 1 || jugador2 == 1 || jugador3 == 1 || jugador4 == 1 || jugador5 == 1 || jugador6 == 1) {
        val tirar = Random.nextInt(1,5)
        if (jugador1 == 1 && tirar == 1) {
            println("jugador 1 Muerto")
            jugador1 = 0
            break
        }
        if (jugador2 == 1 && tirar == 1) {
            println("jugador 2 Muerto")
            jugador2 = 0
            break
        }
        if (jugador3 == 1 && tirar == 1) {
            println("jugador 3 Muerto")
            jugador3 = 0
            break
        }
        if (jugador4 == 1 && tirar == 1) {
            println("jugador 4 Muerto")
            jugador4 = 0
            break}

        if (jugador5 == 1 && tirar == 1) {
            println("jugador 5 Muerto")
            jugador5 = 0
            break
        }
        if (jugador6 == 1 && tirar == 1) {
            println("jugador 6 Muerto")
            jugador6 = 0
            break

        }
    }*/

    /*
    tipos de funciones
    Sin parametros y sin retornos
    Sin parametros y con retornos
    Con parametros y sin retornos
    Con parametros y con retornos

    Clases pascalcase estructura la primera en mayuscula

    solo se puede usar cuando los atributos son privates
    get obtener un valor
    set establecer un valor

    Data class


    */
}

