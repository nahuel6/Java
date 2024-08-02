public class CapacidadExcedidaException extends Exception{
    public CapacidadExcedidaException(String message) {
        super(message);
        System.out.println(message);
    }
}
