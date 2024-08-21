class Operaciones (var n1:Double, var n2:Double) {

    fun suma (n1:Double){
        var res = this.n1
        println(res)
    }



    fun suma (){
        var suma = n1 + n2
        println("La suma es $suma")

    }

    fun resta (){
        var resta = n1 - n2
        println("La resta es $resta")
    }
    fun div ():Double{
        return n1/n2
    }

    fun raiz (x : Double){
        var r = Math.sqrt(x)
        println("La raiz es $r")
    }

    fun cuadrado ( c : Double):Double{
        return Math.pow(c,2.0)
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }


}