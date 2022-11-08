package Portaria_OOP.Business

import Portaria_OOP.Entity.Convidado

//Arquitetura em camadas(em pacotes)

class ConvidadoBusiness {
    fun tipoValido(tipo: String) =
        (tipo == "comum" || tipo == "premium" || tipo == "luxo") // retorna true caso a condição seja aceita

    fun maiorDeIdade(idade: Int) = idade >= 18 // Se for maior de idade é true, caso o contrário é falso

    fun codigoValido(convite: Convidado): Boolean {

        return when (convite.tipo) {
            "comum" -> convite.codigo.startsWith("xt") //Se convite.codigo começar com xt retorna true
            "premium", "luxo" -> convite.codigo.startsWith("xl")
            else -> false // senão retorna false

        }
    }
}