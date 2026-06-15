package com.suicobrasileiro.Cadastro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Benvindo, essa é minha primeira mensagem nesta rota";
    }
}
