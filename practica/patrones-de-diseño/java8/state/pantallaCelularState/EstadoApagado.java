/**
 * Concrete State
 */
public class EstadoApagado implements EstadoPantalla{
  @Override
  public void presionarPantalla(PantallaCelular pantalla){
    System.out.println("Nada sucederá, la pantalla está apagada");
  }
  
  @Override
  public void presionarBotonEncendido(PantallaCelular pantalla){
    System.out.println("Encendiendo celular...");
    
    pantalla.setEstado(new EstadoEncendido());
  }
}
