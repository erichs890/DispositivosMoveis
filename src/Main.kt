class conversaoUnidadesArea{
    fun converterMetro(metro: Double):Double {
        var metro = metro*10.76 //pés quadrados
        return metro
    }
    fun convertePe(pe:Double):Double{
        var pe = pe*929 //centimetros quadrados
        return pe
    }
    fun converteMilha(milha:Double):Double{
        var milha = milha*640 //acreskkkkkkkkkk
        return milha
    }
    fun converteAcre(acre:Double):Double{
        var acre = acre*43560 //pés quadrados
        return acre
    }
}
fun main() {
    val conversor = conversaoUnidadesArea()
    println("Salve paizin, esse eh o conversor de unidades de medida que nem eu sabia que existia")
    println("Escolha um numero e depois escolha qual unidade de medida voce quer ver ele se transformando: ")
    val numero: Double = readln().toDouble()
    while (true) {
        println("1 - Metro pra pés quadrados")
        println("2 - Pés quadrados para centimetros quadrados")
        println("3 - Milhas para acres ")
        println("4 - Acre para pés quadrados")
        println("5 - Quero parar")
        println("")
        val resposta: Int = readln().toInt()
            when (resposta) {
                1 -> {
                    println(conversor.converterMetro(numero))
                    println("Pés quadrados")

                }

                2 -> {
                    println(conversor.convertePe(numero))
                    println("Centimetros quadrados")

                }

                3 -> {
                    println(conversor.converteMilha(numero))
                    println("Acres")

                }

                4 -> {
                    println(conversor.converteAcre(numero))
                    println("Pés quadrados")

                }
                5 ->{
                    println("Abueno Adios Master")
                    break

                }
            }
    }
}
