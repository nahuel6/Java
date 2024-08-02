package enums;

public enum EstadoDeAvion {
    ATERRIZANDO("Aterrizando"),
    DESPEGANDO("Despegando"),
    VOLANDO(" Volando "),
    SUELO(" En suelo");
    private final String estado;

    EstadoDeAvion(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

}
