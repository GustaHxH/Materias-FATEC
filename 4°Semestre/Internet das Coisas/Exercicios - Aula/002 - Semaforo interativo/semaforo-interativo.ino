 // Projeto 4 – Semáforo interativo
 int carRed = 12;     
 int carYellow = 11;
 int carGreen = 10;
 int pedRed = 9;     
 int pedGreen = 8;
 int button = 2;     
 int crossTime = 5000;   

 unsigned long changeTime;  // tempo desde que o botão foi pressionado
 void setup() {
 pinMode(carRed, OUTPUT);
 pinMode(carYellow, OUTPUT);
 pinMode(carGreen, OUTPUT);
 pinMode(pedRed, OUTPUT);
 pinMode(pedGreen, OUTPUT);
 pinMode(button, INPUT);  
 // botão no pino 2
 // acende a luz verde
 digitalWrite(carGreen, HIGH);
 digitalWrite(pedRed, HIGH);
 }
 void loop() {
 int state = digitalRead(button);
 /* verifica se o botão foi pressionado e se transcorreram 5 segundos desde a última vez que 
 isso ocorreu */
 if (state == HIGH && (millis() - changeTime) > 5000) {

 // Chama a função para alterar as luzes
  changeLights();
 }
 }
 void changeLights() {
  digitalWrite(carGreen, LOW);     // apaga o verde do carro
  digitalWrite(carYellow, HIGH);   // acende o amarelo
  delay(2000);                     // espera 2 segundos
  digitalWrite(carYellow, LOW);    // apaga o amarelo
  
  // >>> Ajuste começa aqui <<<
  digitalWrite(pedRed, LOW);       // apaga o vermelho do pedestre
  digitalWrite(carRed, HIGH);      // acende o vermelho do carro
  digitalWrite(pedGreen, HIGH);    // acende o verde do pedestre
  // >>> Ajuste termina aqui <<<

  delay(crossTime);                 // tempo de travessia

  // pisca o verde dos pedestres
  for (int x = 0; x < 10; x++) {
    digitalWrite(pedGreen, HIGH);
    delay(250);
    digitalWrite(pedGreen, LOW);
    delay(250);
  }

  // volta ao normal
  digitalWrite(pedRed, HIGH);     // pedestre vermelho
  digitalWrite(carRed, LOW);      // carro sai do vermelho
  digitalWrite(carGreen, HIGH);   // carro verde
  digitalWrite(carYellow, LOW);   // apaga amarelo

  changeTime = millis();          // registra tempo
  }
