//Classe base
class EtapaProcesso {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    processar(pagamento) {
        throw Error("Este método deve ser implementado pelas subclasses");
    }
}

// Etapas concretas

class EtapaConexao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[INICIO] INICIO DO PROCESSO DE PAGAMENTO");
        console.log("[ETAPA-01] Estabelecendo conexão...");
        // Lógica da conexão
        console.log("[---OK---] Conexão estabelecida");
        if (this.proximaEtapa) {
            this.proximaEtapa.processar(pagamento);
        } else {
            console.log("[------] Falha de conexão... Processo encerrado");
        }
    }
}

class EtapaValidacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-02] Validação de informação do pagamento");
        // Lógica da validação da informação
        if (pagamento.valor > 0) {
            console.log("[---OK---] Informações válidas");
            if (this.proximaEtapa) {
                this.proximaEtapa.processar(pagamento);
            }
        } else {
            console.log("[---ERRO---] Informações inválidas... Processo inválido");
        }
    }
}

class EtapaEnvioInformacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-03] Envio de informações de pagamento...");
        // Lógica do envio de informações do pagamento
        console.log("[---OK---] Informações enviadas");
        if (this.proximaEtapa) {
            this.proximaEtapa.processar(pagamento);
        }
    }
}

class EtapaAutenticacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-04] Autenticação do pagamento...");
        // Lógica de autenticação do pagamento
        console.log("[---OK---] Pagamento Autenticado");
        if (this.proximaEtapa) {
            this.proximaEtapa.processar(pagamento);
        } else {
            console.log("[---ERRO---] Autenticação inválida... Processo inválido");
        }
    }
}

class EtapaConfirmacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("[ETAPA-05] Confirmação do pagamento...");
        // Lógica da confirmação do pagamento
        console.log("[---FIM---] Pagamento realizado com sucesso.");
        console.log("[INICIO] FIM DO PROCESSO DE PAGAMENTO");
    }
}

// Objeto Pagamento:

class Pagamento {
    constructor(valor) {
        this.valor = valor;
    }
}

// Cliente

class Cliente {
    iniciarProcessoPagamento(valor) {
        // Criação das etapas
        const etapaConexao = new EtapaConexao();
        const etapaValidacao = new EtapaValidacao();
        const etapaEnvio = new EtapaEnvioInformacao();
        const etapaAutenticacao = new EtapaAutenticacao();
        const etapaConfirmacao = new EtapaConfirmacao();

        // Confirmação da cadeia
        etapaConexao.setProximaEtapa(etapaValidacao);
        etapaValidacao.setProximaEtapa(etapaEnvio);
        etapaEnvio.setProximaEtapa(etapaAutenticacao);
        etapaAutenticacao.setProximaEtapa(etapaConfirmacao);

        // Criação do pagamento
        const pagamento = new Pagamento(valor);

        // Início do processo
        etapaConexao.processar(pagamento);
    }
}

// Uso:
const cliente = new Cliente();
cliente.iniciarProcessoPagamento(500);