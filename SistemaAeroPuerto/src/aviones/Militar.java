package aviones;

import enums.SistemaDeArmas;

public class Militar extends Avion {
    private int cantidadBalas;
    private Enum sistemaDeArmas;

    public Militar(String modelo, String marca, Double capacidadCombustible, String tipoDeMortor, int cantDeAsientos, int cantidadBalas, Enum sistemaDeArmas) {
        super(modelo, marca, capacidadCombustible, tipoDeMortor, cantDeAsientos);
        this.cantidadBalas = cantidadBalas;
        this.sistemaDeArmas = SistemaDeArmas.AIREAIRE;
    }

    public boolean ingresar (){
        return true;
    }
}
