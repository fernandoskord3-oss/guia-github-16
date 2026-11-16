// Excepcion UNCHECKED (hereda de RuntimeException): no obliga a usar throws.
public class MontoInvalidoException extends RuntimeException {
    public MontoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
