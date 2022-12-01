import java.util.Date;

class Main {
  public static void main(String[] args) {

    Foto foto = new Foto("imprimir");
    Cliente Andreia = new Cliente("Andreia Sales", "034545878-                                    20", foto);
    foto.mostrar();

    ContaDeInvestimentos ci = new ContaDeInvestimentos(new                                       Date(2022,10,02), Andreia);
		ci.deposita(200.0);

    ContaCorrente cc = new ContaCorrente(new Date(2022,11,01),                                             Andreia);
		cc.deposita(100.0); 

    System.out.println("\n Gostaria de sacar 20 reais.");
		cc.saca(20.0);  

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
    
    System.out.println("\n Gostaria de sacar 290 reais.");
    cc.saca(1000.0);  
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
   
    System.out.println("\n Gostaria de sacar 280 reais.");
    cc.saca(100.0); 
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
		
    System.out.println("\n O seu saldo é de R$: " + ci.Saldo());
    System.out.println("O seu rendimento é de R$: " +                                                 ci.rendimento());
    
    ci.transfere(200, cc);
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
    System.out.println("O seu saldo é de R$: " + ci.Saldo());
    
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());


    cc.imprimirExtrato();
    
    System.out.println("\n O seu saldo é de R$: " + cc.getSaldo());

    cc.transfere(200, ci);

    cc.imprimirExtrato();
    ci.imprimirExtrato();
    

    



  
  }
}