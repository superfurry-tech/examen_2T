package examen_2T;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n*** BIENVENIDO A TU GESTOR DEL REFUGIO ***");
    ArrayList<Animal> lista = new ArrayList<>();

    Refugio r1 = new Refugio(lista);

    Animal p1 = new Perro("Lucas", 1, "Galgo");
    Animal p2 = new Perro("Lúa", 2, "Labrador");
    Animal p3 = new Perro("Tor", 3, "Palleirán");

    Animal g1 = new Gato("Sol", 4, true);
    Animal g2 = new Gato("Misifú", 5, false);
    Animal g3 = new Gato("Tom", 6, true);

    r1.admitirAnimal(p1);
    r1.admitirAnimal(p2);
    r1.admitirAnimal(p3);
    r1.admitirAnimal(g1);
    r1.admitirAnimal(g2);
    r1.admitirAnimal(g3);

    System.out.println("\nPreparen sus oídos: ");
    r1.hacerConcierto(lista);

    System.out.println(r1.buscarPorEspecie(p3));


  }
}
