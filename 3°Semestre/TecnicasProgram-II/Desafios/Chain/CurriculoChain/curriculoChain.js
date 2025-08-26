class Curriculo {
    constructor(nome, email, experiencia, texto, formato) {
        this.nome = nome;
        this.email = email;
        this.experiencia = experiencia;
        this.texto = texto;
        this.formato = formato;
    }
}

class EtapaCurriculo {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(etapa) {
        this.proximaEtapa = etapa;
    }

    processar(curriculo) {
        throw new Error("Implementar nas subclasses");
    }
}

class EtapaDados extends EtapaCurriculo {
    processar(curriculo) {
        console.log("[ETAPA-01] Verificando dados...");
        if (curriculo.nome !== "" && curriculo.email !== "") {
            if (this.proximaEtapa) this.proximaEtapa.processar(curriculo);
        } else {
            console.log("Erro: dados básicos ausentes.");
        }
    }
}

class EtapaExperiencia extends EtapaCurriculo {
    processar(curriculo) {
        console.log("[ETAPA-02] Verificando experiência...");
        if (curriculo.experiencia.length > 0) {
            if (this.proximaEtapa) this.proximaEtapa.processar(curriculo);
        } else {
            console.log("Erro: sem experiência.");
        }
    }
}

class EtapaTecnologias extends EtapaCurriculo {
    processar(curriculo) {
        console.log("[ETAPA-03] Verificando tecnologias...");
        const requeridas = ["javascript", "node.js", "react"];
        const texto = curriculo.texto.toLowerCase();
        const contemTodas = requeridas.every(t => texto.includes(t));
        if (contemTodas) {
            if (this.proximaEtapa) this.proximaEtapa.processar(curriculo);
        } else {
            console.log("Erro: faltam tecnologias.");
        }
    }
}

class EtapaFormato extends EtapaCurriculo {
    processar(curriculo) {
        console.log("[ETAPA-04] Verificando formato...");
        if (curriculo.formato === "pdf") {
            console.log("Currículo aprovado!");
        } else {
            console.log("Erro: formato não suportado.");
        }
    }
}

// Execução
const candidato = new Curriculo(
    "João",
    "joao@email.com",
    ["Dev Frontend"],
    "Tenho experiência com JavaScript, Node.js e React.",
    "pdf"
);

const etapa1 = new EtapaDados();
const etapa2 = new EtapaExperiencia();
const etapa3 = new EtapaTecnologias();
const etapa4 = new EtapaFormato();

etapa1.setProximaEtapa(etapa2);
etapa2.setProximaEtapa(etapa3);
etapa3.setProximaEtapa(etapa4);

etapa1.processar(candidato);
