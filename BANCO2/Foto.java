public class Foto {
  
  private String imprimir;

  public Foto(String imprimir){
    this.imprimir = imprimir;
  }

  public void mostrar(){
    System.out.println("Foto enviada");
  }
  
  public String getimprimir(){
    return imprimir;
  }
  
  public void setimprimir(String imprimir){
    this.imprimir = imprimir;
  }
}