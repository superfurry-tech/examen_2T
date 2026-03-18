package examen_2T;

public class Animal {
  private String nombre;
  private int edad;
  private String chip;

  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.chip = "CONSTANTE";
  }

  public void hacerSonido() {
    System.out.println("El animal emite un sonido genérico");
  }

  static int calcularEdadHumana(int edadAnimal) {
    int edadHumana = edadAnimal * 7;
    return edadHumana;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getChip() {
    return chip;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "nombre='" + nombre + '\'' +
        ", edad=" + edad +
        ", chip='" + chip + '\'' +
        '}';
  }
}
