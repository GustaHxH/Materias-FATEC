class CacheDados {
    constructor() {
      if (CacheDados.instancia) {
        return CacheDados.instancia;
      }
      this.dados = {};
      CacheDados.instancia = this;
    }
  
    static getInstance() {
      if (!CacheDados.instancia) {
        CacheDados.instancia = new CacheDados();
      }
      return CacheDados.instancia;
    }
  
    set(chave, valor) {
      this.dados[chave] = valor;
    }
  
    get(chave) {
      return this.dados[chave];
    }
  
    mostrarCache() {
      return this.dados;
    }
  }
  
  const cache1 = CacheDados.getInstance();
  cache1.set("usuario", "Ana");
  
  const cache2 = CacheDados.getInstance();
  cache2.set("token", "abc123");
  
  console.log(cache2.mostrarCache());
  