package examen_2T;

public class Gato extends Animal {
  private boolean esCazador;

  public Gato(String nombre, int edad, boolean esCazador) {
    super(nombre, edad);
    this.esCazador = esCazador;
  }

  @Override
  public void hacerSonido() {
    System.out.println("Miau Miau");
  }

  @Override
  public String toString() {
    return "Animal [Gato {" +
        "nombre='" + getNombre() + '\'' +
        ", edad=" + getEdad() +
        ", chip='" + getChip() + '\'' +
        ", esCazador=" + esCazador +
        "} " +
        ']';
  }
}




