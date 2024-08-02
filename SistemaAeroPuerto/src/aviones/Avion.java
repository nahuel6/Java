package aviones;

import enums.EstadoDeAvion;
import interfaces.Volable;

import java.util.Objects;

public class Avion implements Volable {
    private String nombreModelo;
    private String marca;
    private Double capacidadCombustible;
    private String tipoDeMortor;
    private int cantDeAsientos;
    private Enum estado;

    public Avion(String modelo, String marca, Double capacidadCombustible, String tipoDeMortor, int cantDeAsientos) {
        this.nombreModelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoDeMortor = tipoDeMortor;
        this.cantDeAsientos = cantDeAsientos;
        this.estado = EstadoDeAvion.SUELO;
    }

public void despegar(){

    System.out.println("El Avion esta despegado..." + this.nombreModelo);
    this.estado = EstadoDeAvion.DESPEGANDO;
    //setEstado(EstadoDeAvion.DESPEGANDO);

}

public void aterrizar(){
    System.out.println("El avion esta aterrizando..." + this.nombreModelo);
}

public void volar(){
    System.out.println("El avion esta volando..." + this.nombreModelo);
}

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(Double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoDeMortor() {
        return tipoDeMortor;
    }

    public void setTipoDeMortor(String tipoDeMortor) {
        this.tipoDeMortor = tipoDeMortor;
    }

    public int getCantDeAsientos() {
        return cantDeAsientos;
    }

    public void setCantDeAsientos(int cantDeAsientos) {
        this.cantDeAsientos = cantDeAsientos;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Avion avion)) return false;
        return Objects.equals(getNombreModelo(), avion.getNombreModelo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNombreModelo());
    }

    @Override
    public String toString() {
        return """
                =========== Avion ============
                NombreModelo: %s
                Marca: %s
                CapacidadCombustible: %f
                TipoDeMortor: %s
                CantDeAsientos: %d
                """.formatted(nombreModelo,marca,capacidadCombustible,tipoDeMortor,cantDeAsientos);
    }
}
