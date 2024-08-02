import aviones.Avion;

import java.util.ArrayList;
import java.util.List;

public class AeroPuerto {
    private String nombre;
    private String codigoInternacional;
    private String direccion;
    private int capacidadOperacion;

    private List<Avion> aviones;

    public AeroPuerto(String nombre, String codigoInternacional, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadOperacion = capacidadOperacion;
        this.aviones = new ArrayList<>();
    }

    public void cargarAvion(Avion avion) throws CapacidadExcedidaException {
        if (aviones.size() < capacidadOperacion) {
            aviones.add(avion);
        } else {
            throw new CapacidadExcedidaException("Capacidad operacion superada, no se puede agregar el avion");
        }
    }

    public void mostrarAviones (){
        for(Avion avion : aviones){
            System.out.println(avion);
        }
    }

    public void actualizarEstadoAvion(Avion avion){
        System.out.println(avion.getEstado());
       avion.despegar();
        System.out.println(avion.getEstado());
    }

    public List <Avion> filtrarPorNombre(String nombre){
        List <Avion> nuevaLista = new ArrayList<>();
        for(Avion avion : aviones){
            if(avion.getNombreModelo().equalsIgnoreCase(nombre)){
                nuevaLista.add(avion);
            }
        }
        return nuevaLista;
    }
}
