package org.fatec.aula04_spring_crud.model

data class Contato(
    var id: Int,
    val nome: String,
    val telefone: String,
    val email: String
) {
}