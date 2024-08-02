package aviones;
import entidades.Producto;
import entidades.Servicio;
import interfaces.Serviciable;

import java.util.ArrayList;
import java.util.List;

public class Comercial extends Avion implements Serviciable {
    private int cantidadAzafatas;
    private List<Servicio> servicios;

    public Comercial(String modelo, String marca, Double capacidadCombustible, String tipoDeMortor, int cantDeAsientos, int cantidadAzafatas) {
        super(modelo, marca, capacidadCombustible, tipoDeMortor, cantDeAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = new ArrayList<>();
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }


    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void servirComida(){
    System.out.println("Servir comida.." + super.getNombreModelo());
}

    @Override
    public void darMantas() {
        System.out.println("Dar manta..." + super.getNombreModelo());
    }

    @Override
    public boolean verMundial() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + """
                Tipo Comercial
                CantidadAzafatas: %d
                Servicios: %s
                """.formatted(cantidadAzafatas,servicios);
    }
}