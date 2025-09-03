class ClienteCredito {
    constructor(cpf, renda, score, inadimplente) {
        this.cpf = cpf;
        this.renda = renda;
        this.score = score;
        this.inadimplente = inadimplente;
    }
}

class EtapaCredito {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(etapa) {
        this.proximaEtapa = etapa;
    }

    processar(cliente) {
        throw new Error("Implementar nas subclasses");
    }
}

class EtapaCPF extends EtapaCredito {
    processar(cliente) {
        console.log("[ETAPA-01] Verificando CPF...");
        if (cliente.cpf.length === 11) {
            if (this.proximaEtapa) this.proximaEtapa.processar(cliente);
        } else {
            console.log("Erro: CPF inválido.");
        }
    }
}

class EtapaRenda extends EtapaCredito {
    processar(cliente) {
        console.log("[ETAPA-02] Verificando renda...");
        if (cliente.renda >= 2000) {
            if (this.proximaEtapa) this.proximaEtapa.processar(cliente);
        } else {
            console.log("Erro: renda insuficiente.");
        }
    }
}

class EtapaScore extends EtapaCredito {
    processar(cliente) {
        console.log("[ETAPA-03] Verificando score...");
        if (cliente.score >= 600) {
            if (this.proximaEtapa) this.proximaEtapa.processar(cliente);
        } else {
            console.log("Erro: score baixo.");
        }
    }
}

class EtapaInadimplencia extends EtapaCredito {
    processar(cliente) {
        console.log("[ETAPA-04] Verificando inadimplência...");
        if (!cliente.inadimplente) {
            console.log("Crédito aprovado!");
        } else {
            console.log("Erro: cliente inadimplente.");
        }
    }
}

// Execução
const cliente = new ClienteCredito("12345678901", 3000, 700, false);

const etapa1 = new EtapaCPF();
const etapa2 = new EtapaRenda();
const etapa3 = new EtapaScore();
const etapa4 = new EtapaInadimplencia();

etapa1.setProximaEtapa(etapa2);
etapa2.setProximaEtapa(etapa3);
etapa3.setProximaEtapa(etapa4);

etapa1.processar(cliente);