// Ejercicio A2 - Compila?
// Las lineas que NO compilan estan comentadas para que el proyecto compile.
// Quita el comentario de una en una para ver el error en IntelliJ.
public class EjCompila {

    static class ErrorX extends Exception { }               // checked
    static class ErrorY extends RuntimeException { }        // unchecked

    static void x() { }
    static void cerrar() { System.out.println("cerrar()"); }

    public static void main(String[] args) {

        // a) NO compila: try sin catch ni finally
        //try { x(); }

        // b) SI compila: try + finally
        try { x(); } finally { cerrar(); }

        // c) NO compila: ErrorX es checked y main no declara throws
        //throw new ErrorX();

        // d) SI compila: ErrorY es unchecked (se deja dentro de un if para poder ejecutar)
        if (args.length > 100) {
            throw new ErrorY();
        }

        // e) NO compila: String no implementa AutoCloseable
        // try (String s = "hola") { }

        System.out.println("Resultado: a=No, b=Si, c=No, d=Si, e=No");
    }
}
