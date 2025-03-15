package ejercicio13;

public class Fibonacci {
    public static void main(String[] args) {
        Answer();
    }

    public static void Answer(){
        int primerNumero = 0;
        int segundoNumero=1;

        System.out.println(primerNumero);
        // ¿Y el segundo número no lo muestras por pantalla?
        for (int i=0; i<9;i++){
            // en la segunda iteración deja de ser "primerNumero".
            int temp = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = temp + segundoNumero;

        System.out.println(primerNumero );
        }

    }
}
