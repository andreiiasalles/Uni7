public class Cliente {
  
  private String nome;
  private String cpf;
  private Foto imprimir;

  public Cliente(String nome, String cpf, Foto imprimir){
    this.nome = nome;
    this.cpf = cpf;
    this.imprimir = imprimir;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  public Foto getimprimir(){
    return imprimir;
  }
  
  public void setimprimir(Foto imprimir){
    this.imprimir = imprimir;
  }

}