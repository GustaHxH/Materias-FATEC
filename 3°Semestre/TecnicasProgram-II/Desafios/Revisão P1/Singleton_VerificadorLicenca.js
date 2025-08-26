class VerificadorLicenca {
    constructor() {
      if (VerificadorLicenca.instancia) {
        return VerificadorLicenca.instancia;
      }
      this.licencaValida = false;
      VerificadorLicenca.instancia = this;
    }
  
    static getInstance() {
      if (!VerificadorLicenca.instancia) {
        VerificadorLicenca.instancia = new VerificadorLicenca();
      }
      return VerificadorLicenca.instancia;
    }
  
    validar(chave) {
      this.licencaValida = chave === "CHAVE-VALIDA-123";
    }
  
    estaValida() {
      return this.licencaValida;
    }
  }
  
  const verificador1 = VerificadorLicenca.getInstance();
  verificador1.validar("CHAVE-VALIDA-123");
  
  const verificador2 = VerificadorLicenca.getInstance();
  console.log("Licença válida?", verificador2.estaValida());
  