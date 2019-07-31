package ar.edu.unahur.obj2.ejercicio1;

public abstract class Paquete implements Itinerario {


    public void actualizar() {


        nombre();
        imprimirItinerario();
        getDia1();
        getDia2();
        getDia3();
        transporteIda();
        transporteVuelta();

    }


    abstract void imprimirItinerario();
    abstract String nombre();
    abstract String getDia1();
    abstract String getDia2();
    abstract void getDia3();
    abstract String transporteIda();
    abstract String transporteVuelta();

}
