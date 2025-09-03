package br.gov.sp.cps.revisaoprova.controller;

import br.gov.sp.cps.revisaoprova.Model.Cotacao;
import br.gov.sp.cps.revisaoprova.Model.DadosPessoais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/dados")
    public String dadosAluno() {
        return "dados";
    }

    @PostMapping("/post-dados")
    public String post(@ModelAttribute DadosPessoais dados, ModelMap model) {
        model.addAttribute("altura", dados.getAltura());
        model.addAttribute("idade", dados.getIdade());
        model.addAttribute("nome", dados.getNome());

        return "resultado-dados";
    }

    @GetMapping("/valor")
    public String valor(){
        return "valor";
    }

    @PostMapping("/cotacao")
    public String cotacao(@ModelAttribute Cotacao cotacao, ModelMap model) {
        double calculo = cotacao.getDolar() * cotacao.getReal();
        model.addAttribute("calculo", calculo);
        model.addAttribute("real", cotacao.getReal());
        model.addAttribute("dolar", cotacao.getDolar());

        return "resultado-cotacao";
    }
}