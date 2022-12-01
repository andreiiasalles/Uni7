import java.util.Date;
  
public class ContaCorrente extends Conta {

  double saldo = getSaldo();

  public ContaCorrente(Date dataCriacao, Cliente titular) {
    super(dataCriacao, titular);
  }
  
  public void  deposita(double valor){
    saldo += valor;
    setSaldo(saldo);
    getExtrato().adcionarExtrato("O valor R$ " + valor +" foi depositado. \n O seu saldo é de R$ " + saldo );
  }
     
  public void saca(double valor)  {
    double resultado = getSaldo() - valor;
          
    if (resultado < -1000.0) {
      System.out.println("Limite atingido, " + 
                          " Saldo: " + 
                            getSaldo() + 
                          " Valor desejado: " + 
                            valor);
    } else {
      saldo -= valor;
      setSaldo(saldo);
      getExtrato().adcionarExtrato("\n Foi sacado R$ " + valor + "\n Seu saldo é R$ " + saldo);
      }
  }
  
   public void imprimirExtrato(){
    if(saldo - Extrato.taxa >= -1000){
      super.imprimirExtrato();
    } else {
      System.out.println("Saldo insuficiente.");
    }
  } 
}