import java.util.Date;
import java.util.ArrayList;

public abstract class Conta {
   
  private double saldo;
	private static int agencia = 1234;
	private static int numero = 1111;
	private Cliente titular;
  private Date dataCriacao;
  private Extrato extrato = new Extrato();

 
  public Conta(Date dataCriacao, Cliente titular) {
	  Conta.numero++;
    
    this.dataCriacao = dataCriacao;
    this.titular = titular;
    
	  System.out.println("\nNova conta criada " +
                       "\nTitular: " + titular.getNome()+
                      "\n Numero da conta:" + this.numero +
                      "\n Agência: " + this.agencia  +
                      "\n Data de Criação: " +                                             this.dataCriacao);
  }

  public abstract void  deposita(double valor);
    	
  public abstract void saca(double valor);
  
  public void transfere(double valor, Conta destino){
    if(saldo != 0){
    this.saca(valor);
    destino.deposita(valor);
    }
      else {
        System.out.println("Não há saldo na conta.");
      }
  } 

  public void imprimirExtrato(){
      saldo -= Extrato.taxa;
      System.out.println(extrato.operacoes);
  }
  
  public double getSaldo() { 
    extrato.adcionarExtrato("\n O seu saldo é R$ " + saldo);
    return saldo;
  }
  
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
  public int getnumero() {
	  return this.numero;
  }
	
  public void setNumero(int novoNumero) {
	  this.numero = novoNumero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }
  
  public Extrato getExtrato() {
    return extrato;
  }

  public void setExtrato(Extrato extrato) {
    this.extrato = extrato;
  }

}