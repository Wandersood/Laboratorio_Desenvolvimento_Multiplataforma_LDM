package org.fatec.aula04_spring_crud.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/")
class HomeController {
    @RequestMapping("/")
    fun lerTodos(): ModelAndView {
        val view: ModelAndView = ModelAndView("home")
        view.addObject("message", "Este sevidor e uma API Rest e deve ser chamado por requisoes HTTP")
        return view
    }
}