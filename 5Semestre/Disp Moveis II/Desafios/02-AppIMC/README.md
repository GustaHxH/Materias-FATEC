# App IMC

Aplicativo Android desenvolvido em Java no Android Studio para calcular o Índice de Massa Corporal (IMC) de um usuário.

## Funcionamento

Na tela inicial, o usuário informa:
- Nome
- Peso
- Altura

Ao clicar no botão Calcular, o aplicativo calcula o IMC utilizando a fórmula:

IMC = peso / (altura × altura)

Depois do cálculo, o aplicativo abre uma nova tela mostrando:
- Nome do usuário
- Peso informado
- Valor do IMC
- Classificação do IMC

As classificações utilizadas são:

- Menor que 18,5 → Abaixo do peso  
- 18,5 a 24,9 → Peso normal  
- 25 a 29,9 → Sobrepeso  
- 30 a 34,9 → Obesidade Grau I  
- 35 a 39,9 → Obesidade Grau II  
- 40 ou mais → Obesidade Grau III  

Cada classificação abre uma tela diferente mostrando o resultado.

O botão Voltar fecha a tela de resultado e retorna para a tela inicial, destruindo a Activity para evitar consumo desnecessário de memória.

## Tecnologias utilizadas

- Java  
- Android Studio  
- ConstraintLayout  
- Intents para navegação entre telas