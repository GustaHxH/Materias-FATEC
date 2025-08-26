// Projeto 3 – Semáforo
int ledDelay = 10000; // espera entre as alterações
int redPin = 10;
int yellowPin = 9;
int greenPin = 8;
void setup() {
pinMode(redPin, OUTPUT);
pinMode(yellowPin, OUTPUT);
pinMode(greenPin, OUTPUT);
}

void loop() {
digitalWrite(redPin, HIGH); // acende a luz vermelha
delay(ledDelay); // espera 10 segundos
digitalWrite(redPin, LOW); // apaga a luz vermelha
  
digitalWrite(greenPin, HIGH); // acende a luz verde
delay(ledDelay); // espera ledDelay milissegundos
digitalWrite(greenPin, LOW); // apaga a luz verde
  
digitalWrite(yellowPin, HIGH); // acende a luz amarela
delay(3000); // espera 2 segundos
digitalWrite(yellowPin, LOW); // apaga a luz amarela
// agora nosso loop se repete
}