package org.fatec

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")

    val c1 = Contato("João", "11111-1111", "joaoteste@email.com")

    var c3:Contato? = c1.copy("Maria", "22222-2222", "joao@email.com")

    println(c1)
    println(c1.nome)
    println(c1.telefone)
    println(c1.email)

    println("Dados do contato 2: $c3")

}

data class Contato(
    val nome: String,
    val telefone: String,
    val email: String

)