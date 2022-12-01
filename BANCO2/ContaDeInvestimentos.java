import java.util.Date;
import java.util.Calendar;
  
public class ContaDeInvestimentos extends Conta {

  private double rendimento;
  private int diasCorridos;
  private Calendar dataUltimoRendimento = Calendar.getInstance();
  double saldo = getSaldo();

  
  public ContaDeInvestimentos(Date dataCriacao, Cliente titular){
    super(dataCriacao, titular);
    dataUltimoRendimento.set(2022,10,01);
  }
  
  public void  deposita(double valor){
    saldo += valor;
    setSaldo(saldo);
    getExtrato().adcionarExtrato("O valor R$ " + valor +" foi depositado. \n O seu saldo é de R$ " + saldo );

  }
  
	public void saca(double valor){
    if(getSaldo() < valor) {
      System.out.println("Saldo: " + getSaldo() + ", Valor: " + valor);
    } 
      else {
        saldo -= valor;
        setSaldo(saldo); 
        getExtrato().adcionarExtrato("\n Foi sacado R$ " + valor +                                     "\n Seu saldo é R$ " + saldo);

      }   
  }

  public double Saldo() { 
    rendimento();
    getExtrato().adcionarExtrato("\n O seu saldo é R$ " + saldo);
    return saldo;
  }
  
  public double rendimento() {
    Calendar dataHoje = Calendar.getInstance();
    dataHoje.setTime(new Date());
    
    if(dataUltimoRendimento.get(Calendar.DAY_OF_MONTH) !=               dataHoje.get(Calendar.DAY_OF_MONTH)){
      
      Calendar data = Calendar.getInstance();
      data.setTime(getDataCriacao());

      dataHoje.add(Calendar.DATE, -                                                   data.get(Calendar.DAY_OF_MONTH));
      diasCorridos = dataHoje.get(Calendar.DAY_OF_MONTH);
    
      rendimento = diasCorridos * 1.038;
      saldo += rendimento;
      setSaldo(saldo);
      
      dataUltimoRendimento = Calendar.getInstance();
    }
      getExtrato().adcionarExtrato("\n O seu rendimento é R$ " + rendimento);

      return rendimento;
   }
  
  public void imprimirExtrato(){
    if(saldo - Extrato.taxa >= 0){
      super.imprimirExtrato();
    } else {
      System.out.println("Saldo insuficiente.");
    }
  } 
}

 