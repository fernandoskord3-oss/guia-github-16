// Excepcion CHECKED (hereda de Exception): el compilador obliga a atraparla o declararla.
public class SaldoInsuficienteException extends Exception {
    private int faltante;

    public SaldoInsuficienteException(String mensaje, int faltante) {
        super(mensaje);
        this.faltante = faltante;
    }

    public int getFaltante() {
        return faltante;
    }
}
