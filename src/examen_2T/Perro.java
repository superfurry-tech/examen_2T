package examen_2T;

public class Perro extends Animal {
  private String raza;

  public Perro(String nombre, int edad, String raza) {
    super(nombre, edad);
    this.raza = raza;
  }

  @Override
  public void hacerSonido() {
    System.out.println("Guau Guau");
  }

  @Override
  public String toString() {
    return "Animal [Perro {" +
        "nombre='" + getNombre() + '\'' +
        ", edad=" + getEdad() +
        ", chip='" + getChip() + '\'' +
        ", raza='" + raza + '\'' +
        "} " +
        ']';
  }
}
