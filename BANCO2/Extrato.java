import java.util.ArrayList;

public class Extrato {

  int cont = 0;
  public static final double taxa = 3.0;
  
  ArrayList<String> operacoes = new ArrayList<>();

  public void adcionarExtrato(String operacao){
    if(cont < 20){
      operacoes.add(operacao);
      cont ++;
    }
      else{
      operacoes.remove(0);
      operacoes.add(operacao);        
      }
  }

}