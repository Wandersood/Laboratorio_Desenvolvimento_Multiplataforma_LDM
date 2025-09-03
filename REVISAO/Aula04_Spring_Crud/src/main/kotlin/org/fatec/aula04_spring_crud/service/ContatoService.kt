package org.fatec.aula04_spring_crud.service

import org.fatec.aula04_spring_crud.model.Contato
import org.fatec.aula04_spring_crud.repository.ContatoRepository
import org.springframework.stereotype.Service

@Service
class ContatoService(val contatoRepository: ContatoRepository) {


    fun consultarTodos(): List<Contato> {
        return contatoRepository.consultarTodos()
    }

    fun adicionar(contato: Contato) {
        contatoRepository.adicionar(contato)
    }

    fun remover(id: Int) {
        contatoRepository.remover(id)
    }

    fun atualizar(id: Int, contato: Contato) {
        contatoRepository.atualizar(id, contato)
    }
}