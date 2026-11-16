// Ejercicio A3 - excepcion CHECKED con dato extra (el limite)
public class LimiteExcedidoException extends Exception {
    private int limite;

    public LimiteExcedidoException(int monto, int limite) {
        super("El retiro de $" + monto + " supera el limite diario de $" + limite);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }
}
