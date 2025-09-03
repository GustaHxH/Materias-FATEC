class Logger {
    constructor() {
      if (Logger.instancia) {
        return Logger.instancia;
      }
      this.logs = [];
      Logger.instancia = this;
    }
  
    static getInstance() {
      if (!Logger.instancia) {
        Logger.instancia = new Logger();
      }
      return Logger.instancia;
    }
  
    escrever(mensagem) {
      const timestamp = new Date().toISOString();
      this.logs.push(`[${timestamp}] ${mensagem}`);
    }
  
    mostrarLogs() {
      return this.logs.join('\n');
    }
  }
  
  const log1 = Logger.getInstance();
  log1.escrever("Sistema iniciado");
  
  const log2 = Logger.getInstance();
  log2.escrever("Usuário fez login");
  
  console.log(log2.mostrarLogs());
  