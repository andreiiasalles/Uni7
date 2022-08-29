class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    carro1.modelo = "FUSCA";

    for (int i = 0; i < 4; i++) {
      Aro aro = new Aro();
      aro.diametro = 14;
      aro.material = "Liga Leve";
      aro.modelo = "SeiLa";

      Pneu pneu = new Pneu();
      pneu.diametro = 14;
      pneu.pressao = 30;
      pneu.perfil = 175;

      Roda roda = new Roda();
      roda.aro = aro;
      roda.pneu = pneu;
      
      carro1.rodas[i] = roda;
    }

    Motor motor = new Motor();
    motor.potencia = 100;
    carro1.motor = motor;

    TanqueCombustivel tanque = new TanqueCombustivel();
    tanque.capacidadeMaxima = 45;
    tanque.volumeAtual = 15;
    carro1.tanque = tanque;

    carro1.estepe = new Roda();
    carro1.estepe.aro = new Aro();
    carro1.estepe.aro.diametro = 14;
    carro1.estepe.aro.material = "Liga Leve";
    carro1.estepe.aro.modelo = "SeiLa";
    
  carro1.TrocaDePneu(carro1.rodas[0], carro1.estepe);
  }


}
