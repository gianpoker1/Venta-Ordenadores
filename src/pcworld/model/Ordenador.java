package pcworld.model;

public class Ordenador {

    private int idOrdenador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorOrdenadores;

    private Ordenador(){
        idOrdenador = ++contadorOrdenadores;
    }

    public Ordenador(Monitor monitor, Teclado teclado, Raton raton, String nombre) {
        this();
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "idOrdenador=" + idOrdenador +
                ", nombre='" + nombre + '\'' +
                "\n -> monitor=" + monitor +
                "\n -> teclado=" + teclado +
                "\n -> raton=" + raton +
                '}';
    }
}
