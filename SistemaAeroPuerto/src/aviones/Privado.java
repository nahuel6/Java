package aviones;

import interfaces.Serviciable;

public class Privado extends Avion implements Serviciable {
    private boolean jacuzzi;
    private String claveWifi;

    public Privado(String modelo, String marca, Double capacidadCombustible, String tipoDeMortor, int cantDeAsientos, boolean jacuzzi, String claveWifi) {
        super(modelo, marca, capacidadCombustible, tipoDeMortor, cantDeAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    @Override
    public void servirComida() {
        System.out.println("Servir comida.." + super.getNombreModelo());
    }

    @Override
    public void darMantas() {
        System.out.println("Dar manta..." + super.getNombreModelo());
    }

    @Override
    public boolean verMundial() {
        return true;
    }
}
