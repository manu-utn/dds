/**
 * Auto Generated Java Class.
 */
public class Tren implements Transporte{
  @Override
  public void reparar(){
    System.out.println("Reparando las ruedas del tren...");
  }
  
  @Override
  public void conducir(){
    System.out.println("Calentando motores del tren para arrancar...");
  }
  
  @Override
  public double costoMantenimiento(){
    return 250*3+15;
  }
}
