package Portaria_OOP.Control

class Console private constructor(){ // private para não instanciarem o console pois não precisa
    companion object{ // Coloca as funções apenas no escopo da classe, ela será usada apenas se chamar a classe Console junta
        fun readInt(mensagem: String): Int{ // Função pra ler a idade
            var retorno: Int? = null // Instancio como null pra poder usar no Do While
            do {
                print(mensagem)
                val info = readLine()

                if (info != null && info != ""){
                    retorno = info.toIntOrNull() // Caso não seja Int, retornará um null
                    if (retorno == null || retorno <= 0){
                        println("Valor inválido.") // Se o valor de retorno retornar nulo, será inválido
                    }
                }
            } while (retorno == null || retorno <= 0) // Repete a pergunta até que ela não seja nula
            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null // Deixa receber um null
            do {
                print(msg) // Printa a mensagem escrita quando a função é chamada
                val info = readLine()

                if (info != null && info != ""){
                    retorno = info.lowercase()
                } else {
                    println("Valor inválido.")
                }
            } while (retorno == null)
            return retorno
        }
    }
}