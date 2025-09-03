// Classe base
class EtapaProcesso {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(etapa) {
        this.proximaEtapa = etapa;
    }

    processar(pagamento) {
        throw new Error("Implementar nas subclasses");
    }
}

// Etapas concretas

class EtapaConexao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-01] Estabelecendo conexão...");
        if (this.proximaEtapa) this.proximaEtapa.processar(pagamento);
    }
}

class EtapaValidacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-02] Validando valor do pagamento...");
        if (pagamento.valor > 0) {
            if (this.proximaEtapa) this.proximaEtapa.processar(pagamento);
        } else {
            console.log("Erro: valor inválido.");
        }
    }
}

class EtapaEnvioInformacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-03] Enviando dados...");
        if (this.proximaEtapa) this.proximaEtapa.processar(pagamento);
    }
}

class EtapaAutenticacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-04] Autenticando...");
        if (this.proximaEtapa) this.proximaEtapa.processar(pagamento);
    }
}

class EtapaConfirmacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-05] Pagamento confirmado.");
    }
}

// Classe simples
class Pagamento {
    constructor(valor) {
        this.valor = valor;
    }
}

// Execução
class Cliente {
    iniciarPagamento(valor) {
        const pagamento = new Pagamento(valor);

        const etapa1 = new EtapaConexao();
        const etapa2 = new EtapaValidacao();
        const etapa3 = new EtapaEnvioInformacao();
        const etapa4 = new EtapaAutenticacao();
        const etapa5 = new EtapaConfirmacao();

        etapa1.setProximaEtapa(etapa2);
        etapa2.setProximaEtapa(etapa3);
        etapa3.setProximaEtapa(etapa4);
        etapa4.setProximaEtapa(etapa5);

        etapa1.processar(pagamento);
    }
}

// Teste
const cliente = new Cliente();
cliente.iniciarPagamento(500);