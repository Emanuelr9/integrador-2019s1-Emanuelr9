package ar.edu.unahur.obj2.ejercicio1;

public class PaquetePatagonia extends Paquete {


    public void getItinerario() {
        print("Nombre: Paquete Patagonia");
        print("Transporte Ida: Traslado desde el aeropuerto de El calafate al hotel Huemul");
        print("Dia 1: Visita ciudad Calafate");
        print("Dia 2: Visita Glaciar Perito Moreno");
        print("Dia 3: Naveción Glaciares");
        print("Transporte Vuelta: Traslado del hotel Huemul al aeropuerto de El Calafate ");
    }

    private void print(String texto) {
        System.out.println(texto);
    }

    @Override
    void imprimirItinerario() {

    }

    @Override
    String nombre() {
        return null;
    }

    @Override
    String getDia1() {
        return null;
    }

    @Override
    String getDia2() {
        return null;
    }

    @Override
    void getDia3() {

    }

    @Override
    String transporteIda() {
        return null;
    }

    @Override
    String transporteVuelta() {
        return null;
    }
}
