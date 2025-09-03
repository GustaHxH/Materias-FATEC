package br.gov.sp.cps.exercicio_teste.controller;

import br.gov.sp.cps.exercicio_teste.Model.DadosPessoais;
import br.gov.sp.cps.exercicio_teste.Model.Temperatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/dados")
    public String dadosPessoais(){
        return "dados";
    }

    @PostMapping("/result-dados")
    public String post(@ModelAttribute DadosPessoais dados, ModelMap model){
        model.addAttribute("nome", dados.getNome());
        model.addAttribute("cidade", dados.getCidade());
        model.addAttribute("estado", dados.getEstado());

        return "dados-resultado";
    }

    @GetMapping("/temp")
    public String temperatura(){
        return "temp";
    }

    @PostMapping("/temp-resultado")
    public String postTemperatura(@ModelAttribute Temperatura temperatura, ModelMap model){
        double fahrenheit = temperatura.getCelcius() * 9/5 + 32;
        model.addAttribute("fahrenheit", fahrenheit);
        model.addAttribute("celcius", temperatura.getCelcius());

        return "temp-resultado";
    }
}
