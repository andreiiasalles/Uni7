class Carro {

  int ano;
  String marca;
  String modelo;
  int velocidadeMaxima;
  String placa;
  String cor;
  String chassi;
  String categoria; //
  Roda[] rodas;
  Roda estepe;
  Motor motor;  
  TanqueCombustivel tanque;

  public void TrocaDePneu (Roda newpneu, Roda oldpneu){

    oldpneu = newpneu;

  }
}
