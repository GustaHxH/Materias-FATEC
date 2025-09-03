class Aluno:
# _XXXXXXXX -> Indica que o atributo é protegido
    _instancia = None
    _inicializado = False

# '*' -> Desempacota sequencias (lista, tuplas, etc)
# '**' -> Desempacota dicionários (estruturas)
    def __new__(cls, *args, **kwargs):
        if not cls._instancia:
            cls._instancia = super().__new__(cls, *args, **kwargs)
        return cls._instancia
    
    def __init__(self):
        if not self._inicializado:
            self._inicializado = True
            self.nome = ""
            self.notas = {}

    def definirNome(self, nome):
        self.nome = nome

    def addNota(self, disciplina, nota):
        self.notas[disciplina] = nota

    def calcularMedia(self):
        total = sum(self.notas.values())
        return total / len(self.notas)

# Exemplo de uso;
if __name__ == "__main__":
    #instanciando o Aluno:
    aluno1 = Aluno()
    aluno1.definirNome("João da Silva")

    #Adicionar Notas:
    aluno1.addNota("Matemática", 8.0)
    aluno1.addNota("Portugês", 7.0)
    aluno1.addNota("História", 9.0)

    #Obter a média de notas:
    print(f"Média de {aluno1.nome}: {aluno1.calcularMedia()}")

     #instanciando o Aluno:
    aluno2 = Aluno()
    aluno2.definirNome("Maria da Silva")

    #Adicionar Notas:
    aluno2.addNota("Matemática", 9.0)
    aluno2.addNota("Portugês", 8.0)
    aluno2.addNota("História", 10.0)

    #Obter a média de notas:
    print(f"Média de {aluno2.nome}: {aluno2.calcularMedia()}")
    