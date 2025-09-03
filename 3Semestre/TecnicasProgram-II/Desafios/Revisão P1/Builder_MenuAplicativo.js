class Menu {
    constructor() {
      this.titulo = "";
      this.icones = [];
      this.atalhos = [];
      this.submenus = [];
    }
  
    mostrar() {
      return `
  Título: ${this.titulo}
  Ícones: ${this.icones.join(', ')}
  Atalhos: ${this.atalhos.join(', ')}
  Submenus: ${this.submenus.join(', ')}
      `.trim();
    }
  }
  
  class MenuBuilder {
    constructor() {
      this.menu = new Menu();
    }
  
    setTitulo(titulo) {
      this.menu.titulo = titulo;
      return this;
    }
  
    adicionarIcone(icone) {
      this.menu.icones.push(icone);
      return this;
    }
  
    adicionarAtalho(atalho) {
      this.menu.atalhos.push(atalho);
      return this;
    }
  
    adicionarSubmenu(submenu) {
      this.menu.submenus.push(submenu);
      return this;
    }
  
    build() {
      return this.menu;
    }
  }
  
  const menu = new MenuBuilder()
    .setTitulo("Menu Principal")
    .adicionarIcone("home.png")
    .adicionarIcone("config.png")
    .adicionarAtalho("Ctrl+M")
    .adicionarSubmenu("Perfil")
    .adicionarSubmenu("Sair")
    .build();
  
  console.log(menu.mostrar());