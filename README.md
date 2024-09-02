# Venta de Ordenadores en Java

Este proyecto es una aplicación en Java que simula la venta de ordenadores. La aplicación permite crear objetos de ordenadores, los cuales contienen objetos de ratón, teclado y monitor. Las clases `Teclado` y `Monitor` heredan de la clase `DispositivoEntrada` para compartir atributos comunes.

## Características

- Creación de objetos de ordenadores con sus respectivos dispositivos (ratón, teclado y monitor).
- Uso de herencia para compartir atributos comunes entre dispositivos de entrada.
- Manejo de listas de ordenadores en una orden.
- Visualización de los detalles de las órdenes y los ordenadores.

## Tecnologías Utilizadas

- Java
- ArrayList para almacenar los datos de los ordenadores.

## Instrucciones de Uso

1. Clona el repositorio:

    ```bash
    git clone https://github.com/gianpoker1/Venta-Ordenadores.git
)
    cd Venta Ordenadores
    ```

2. Compila los archivos Java:

    ```bash
    javac DispositivoEntrada.java Raton.java Teclado.java Monitor.java Ordenador.java Orden.java VentaOrdenadoresApp.java
    ```

3. Ejecuta el programa:

    ```bash
    java VentaOrdenadoresApp
    ```

## Estructura del Proyecto

- `DispositivoEntrada.java`: Clase base para dispositivos de entrada.
- `Raton.java`: Clase que representa un ratón y hereda de `DispositivoEntrada`.
- `Teclado.java`: Clase que representa un teclado y hereda de `DispositivoEntrada`.
- `Monitor.java`: Clase que representa un monitor.
- `Ordenador.java`: Clase que representa un ordenador y contiene objetos de ratón, teclado y monitor.
- `Orden.java`: Clase que representa una orden y contiene una lista de ordenadores.
- `VentaOrdenadoresApp.java`: Clase principal que contiene el código para crear y mostrar órdenes de ordenadores.

## Ejemplo de Uso

Orden #: 1

Total Ordenadores: 2

Ordenador{idOrdenador=1, nombre='Lenovo One'

-> monitor=Monitor{idMonitor=1, marca='Lenovo', tamanio=27.0}

-> teclado=Teclado{idTeclado=1} DispositivoEntrada{tipoEntrada='USB', marca='Lenovo'}

-> raton=Raton{idRaton=1} DispositivoEntrada{tipoEntrada='USB', marca='Lenovo'}}

Ordenador{idOrdenador=2, nombre='Samsung Light'

-> monitor=Monitor{idMonitor=2, marca='Samsung', tamanio=29.0}

-> teclado=Teclado{idTeclado=2} DispositivoEntrada{tipoEntrada='Bluetooh', marca='Samsung'}

-> raton=Raton{idRaton=2} DispositivoEntrada{tipoEntrada='Bluetooh', marca='Samsung'}}

Orden #: 2

Total Ordenadores: 3

Ordenador{idOrdenador=3, nombre='Hp black'

-> monitor=Monitor{idMonitor=3, marca='Samsung', tamanio=24.0}

-> teclado=Teclado{idTeclado=3} DispositivoEntrada{tipoEntrada='USB', marca='Hp'}

-> raton=Raton{idRaton=3} DispositivoEntrada{tipoEntrada='USB', marca='Hp'}}

Ordenador{idOrdenador=1, nombre='Lenovo One'

-> monitor=Monitor{idMonitor=1, marca='Lenovo', tamanio=27.0}

-> teclado=Teclado{idTeclado=1} DispositivoEntrada{tipoEntrada='USB', marca='Lenovo'}

-> raton=Raton{idRaton=1} DispositivoEntrada{tipoEntrada='USB', marca='Lenovo'}}

Ordenador{idOrdenador=2, nombre='Samsung Light'

-> monitor=Monitor{idMonitor=2, marca='Samsung', tamanio=29.0}

-> teclado=Teclado{idTeclado=2} DispositivoEntrada{tipoEntrada='Bluetooh', marca='Samsung'}

-> raton=Raton{idRaton=2} DispositivoEntrada{tipoEntrada='Bluetooh', marca='Samsung'}}
