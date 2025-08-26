package br.gov.sp.cps.springinitializr.Controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    //Simulação de recebimento de variáveis:
    String peso = "80";
    String altura = "1.70";

    //Converter para número:
    double numPeso = Double.parseDouble(peso);
    double numAltura = Double.parseDouble(altura);

    //Calcular imc:
    double numImc = numPeso/ (numAltura * numAltura);

    //Transformando em String:
    String imc = String.format("%.2f", numImc);

    @GetMapping("/imc")
    public String resultadoimc(ModelMap model) {
        model.addAttribute("imc", imc);
        return "resultadoimc";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model) {
        model.addAttribute("nome", nome);
        return "saudacao";
    }

    @GetMapping("/home")
    public String home(ModelMap model) {
        model.addAttribute("curso", "Dev Multi Plataforma");
        return "home";
    }
}
