package aviones;

import entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public class DeCarga extends Avion {
    private double kilosAAdministrar;
    private List<Producto> productos;

    public DeCarga(String modelo, String marca, Double capacidadCombustible, String tipoDeMortor, double kilosAAdministrar) {
        super(modelo, marca, capacidadCombustible, tipoDeMortor, 0);
        this.kilosAAdministrar = kilosAAdministrar;
        this.productos = new ArrayList<>();
    }

    public double getKilosAAdministrar() {
        return kilosAAdministrar;
    }

    public void setKilosAAdministrar(double kilosAAdministrar) {
        this.kilosAAdministrar = kilosAAdministrar;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public boolean ingresar (){
        return true;
    }

    void descargarContenido(){
        System.out.println("Descargando contenido del avión de carga " + super.getNombreModelo());
        productos.clear();
    }

    @Override
    public String toString() {
        return super.toString() + """
                Tipo: DeCarga
                KilosAAdministrar: %f
                Productos: %s
                """.formatted(kilosAAdministrar,productos);
    }
}
