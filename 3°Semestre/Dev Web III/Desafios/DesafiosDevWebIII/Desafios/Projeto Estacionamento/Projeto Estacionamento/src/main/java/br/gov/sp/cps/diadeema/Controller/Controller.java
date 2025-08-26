package br.gov.sp.cps.diadeema.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/teste")
    public String testar() {
        return "Tudo funcionando!";
    }
}