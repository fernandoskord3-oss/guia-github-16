// Ejercicio A3 - Limite diario de retiro (acumulado)
public class CajeroLimite {
    private int saldo;
    private int retiradoHoy = 0;
    private static final int LIMITE = 200;

    public CajeroLimite(int saldo) {
        this.saldo = saldo;
    }

    public void retirar(int monto) throws LimiteExcedidoException, SaldoInsuficienteException {
        // Primero se revisa el limite, despues el saldo
        if (retiradoHoy + monto > LIMITE) {
            throw new LimiteExcedidoException(monto, LIMITE);
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente", monto - saldo);
        }
        saldo -= monto;
        retiradoHoy += monto;
    }

    public int getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CajeroLimite c = new CajeroLimite(500);
        int[] montos = { 150, 80, 40 };
        for (int m : montos) {
            try {
                c.retirar(m);
                System.out.println("Retiro de $" + m + " -> saldo $" + c.getSaldo());
            } catch (LimiteExcedidoException e) {
                System.out.println(e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage() + ": faltan $" + e.getFaltante());
            }
        }
    }
}
