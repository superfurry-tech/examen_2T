package examen_2T;

import java.util.ArrayList;

public class Refugio {
  private ArrayList<Animal> listaAnimales = new ArrayList<>();
  private final int CAPACIDAD_MAXIMA = 5;

  public Refugio(ArrayList<Animal> listaAnimales) {
    this.listaAnimales = listaAnimales;
  }

  public void admitirAnimal(Animal a) {
    if (listaAnimales.size() < CAPACIDAD_MAXIMA) {
      listaAnimales.add(a);
      System.out.println(a.getNombre() + " añadido");
    } else {
      System.out.println("!Capacidad agotada! No se puede admitir a " + a.getNombre());
    }
  }

  public void mostrarAnimales(ArrayList<Animal> listaAnimales) {
    for (Animal a : listaAnimales) {
      System.out.println(a);
    }
  }

  public void hacerConcierto(ArrayList<Animal> listaAnimales) {
    for (Animal a : listaAnimales) {
      a.hacerSonido();
    }
  }

  public ArrayList<Animal> buscarPorEspecie(Animal animalReferencia) {
    ArrayList<Animal> listaPerros = new ArrayList<>();
    ArrayList<Animal> listaGatos = new ArrayList<>();
    if (animalReferencia instanceof Perro) {
      for (Animal a : listaAnimales) {
        Perro p = (Perro) a;
        if (p.getRaza() != null);
        listaPerros.add(p);
        return listaPerros;
      }
    } else {
      for (Animal a : listaAnimales) {
        listaGatos.add(a);
      }
    }
    return listaGatos;
  }
}
