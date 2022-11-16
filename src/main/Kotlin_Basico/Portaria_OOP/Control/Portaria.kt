package Portaria_OOP.Control

import Portaria_OOP.Business.ConvidadoBusiness
import Portaria_OOP.Entity.Convidado

class Portaria{
    private val convidadoBusiness = ConvidadoBusiness()
    init{
        println("Portaria inicializada")
        println(controle())
    }
    private fun controle(): String{
        val idade = Console.readInt("Digite sua idade: ")
        val convidado = Convidado(idade = idade) // Valida idade com o valor recebido no input

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)){
            return "Negado, menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Digite o tipo do seu convite: ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Escreva o tipo de convite: ")
        if (!convidadoBusiness.codigoValido(convidado)){
            return "Negado. Codigo inválido."
        }
        return "Seja bem vindo :)"
    }
}