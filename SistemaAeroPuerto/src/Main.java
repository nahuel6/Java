import aviones.Avion;
import aviones.DeCarga;

public class Main {
    public static void main(String[] args) {

        AeroPuerto aeroPuerto = new AeroPuerto("Ezeiza", "1226", "Caravajal 2234", 3);
        Avion avion1 = new Avion("Boeing 7", "Carls", 40.5, "L4556",60);
        Avion avion2 = new Avion("Boeing 9", "Carls", 40.6, "L4556",60);
        Avion avion3 = new Avion("Boeing 1", "Carls", 40.8, "L4556",60);
        Avion avion4 = new DeCarga("Boeing 1", "Carls", 40.8, "L4556",60);
        try {
            aeroPuerto.cargarAvion(avion1);
            aeroPuerto.cargarAvion(avion2);
            aeroPuerto.cargarAvion(avion3);
            aeroPuerto.cargarAvion(avion4);
        }catch (CapacidadExcedidaException e){

        }

        aeroPuerto.mostrarAviones();
        aeroPuerto.actualizarEstadoAvion(avion4);
    }
}