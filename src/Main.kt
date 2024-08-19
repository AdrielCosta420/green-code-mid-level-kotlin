fun main() {
    println("Olá! Com que tipo de transporte você geralmente se locomove a um destino?")


    val fatorEmissaoCarro:Double = 0.21
    val fatorEmissaoOnibus:Double = 0.105
    val fatorEmissaoAviao:Double = 0.133


    println("Quanto você percorreu com seu transporte?")
    var inputDistanciaKM = readln().toDouble()

    println("Que veículo você utilizou?")
    println("1 - ${Automoveis.carro} | 2 - ${Automoveis.onibus} | 3 - ${Automoveis.aviao}")
    var inputTransporte = readln().toInt()

    val fatorEmissaoCarbono = listOf(fatorEmissaoCarro, fatorEmissaoOnibus, fatorEmissaoAviao)




    fun calculateCarbonForKm(qntdKm:Double, valueForCarbon:Double) {
        var total = qntdKm * valueForCarbon
        println("O total da pegada de carborno corresponde a: $total")
    }

    when(inputTransporte) {
        1 -> calculateCarbonForKm(inputDistanciaKM, fatorEmissaoCarbono[0])
        2 -> calculateCarbonForKm(inputDistanciaKM, fatorEmissaoCarbono[1])
        3 -> calculateCarbonForKm(inputDistanciaKM, fatorEmissaoCarbono[2])
    }

}

enum class Automoveis{
    carro, onibus, aviao
}