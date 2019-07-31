package ar.edu.unahur.obj2.ejercicio1;

public  class PaqueteCuyo extends Paquete  {


    public String getNombre() {
        return "Paquete Cuyo";
    }



    public void imprimirItinerario() {
        print("Nombre: " + getNombre());
        print("Transporte Ida: " + TransporteIda());
        print("Dia 1: " + getDia1());
        print("Dia 2: " + getDia2());
        print("Dia 3: " + Dia3());
        print("Transporte Vuelta: " + TransporteVuelta());
    }

    @Override
    String nombre() {
        return null;
    }

    private void print(String texto) {
        System.out.println(texto);
    }


    protected String TransporteIda() {
        return "Traslado desde el aeropuerto de Mendoza al hotel San Martin";
    }

    protected String getDia1() {
        return "Visita ciudad de Mendoza";
    }

    protected String getDia2() {
        return "Circuito Vitivinicola";
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

    protected String Dia3() {
        return "Visita chapelco";
    }

    protected String TransporteVuelta() {
        return "Traslado desde el hotel San Martin al aeropuerto de Mendoza";
    }


}
