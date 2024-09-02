package pcworld.services;

import pcworld.model.Ordenador;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private final int idOrden;
    private final List<Ordenador> ordenadores;

    private static int contadorOrden;

    public Orden(){
        ordenadores = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void agregarOrdenador(Ordenador ordenador){
        ordenadores.add(ordenador);
    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total Ordenadores: " + ordenadores.size());
        ordenadores.forEach(System.out::println);
    }
}
