package org.fatec

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val lista = listOf("Joao", "Maria", "Jose")

    val alfredoInLista = "Alfredo" in lista
    val joaoInLista = "Joao" in lista

    println("Alfredo está na lista? $alfredoInLista")
    println("Joao está na lista? $joaoInLista")

}