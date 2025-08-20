package org.fatec.Aula03_Spring

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

val servico: Servico = Servico()

@Controller
@RequestMapping("/")
class Controlador{
    @RequestMapping("/")
    fun olaPrincipal(): ResponseEntity<String> {
        return ResponseEntity.ok("<h1>Olá, Mundo!</h1>")
    }
    @RequestMapping("/ola")
    fun ola(): ResponseEntity<String> {
        return ResponseEntity.ok(servico.gerarOla())
    }
}