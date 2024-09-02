package pcworld;

import pcworld.model.Monitor;
import pcworld.model.Ordenador;
import pcworld.model.Raton;
import pcworld.model.Teclado;
import pcworld.services.Orden;


public class VentaOrdenadoresApp {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        //.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("USB",  "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);
        Ordenador ordenadorLenovo = new Ordenador(monitorLenovo, tecladoLenovo, ratonLenovo, "Lenovo One");
        //System.out.println(ordenadorLenovo);

        //Objeto Ordenador
        Raton ratonSamsung = new Raton("Bluetooh", "Samsung");
        Teclado tecladoSamsung = new Teclado("Bluetooh",  "Samsung");
        Monitor monitorSamsung = new Monitor("Samsung", 29);
        Ordenador ordenadorSamsung = new Ordenador(monitorSamsung, tecladoSamsung, ratonSamsung, "Samsung Light");

        //Objeto Ordenador
        Raton ratonHp = new Raton("USB", "Hp");
        Teclado tecladoHp = new Teclado("USB",  "Hp");
        Monitor monitorHp = new Monitor("Samsung", 24);
        Ordenador ordenadorHp = new Ordenador(monitorHp, tecladoHp, ratonHp, "Hp black");


        //Crear orden
        Orden orden1= new Orden();
        orden1.agregarOrdenador(ordenadorLenovo);
        orden1.agregarOrdenador(ordenadorSamsung);
        orden1.mostrarOrden();

        //crear Orden
        Orden orden2 = new Orden();
        orden2.agregarOrdenador(ordenadorHp);
        orden2.agregarOrdenador(ordenadorLenovo);
        orden2.agregarOrdenador(ordenadorSamsung);
        System.out.println();
        orden2.mostrarOrden();

    }
}