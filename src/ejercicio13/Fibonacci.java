package ejercicio13;

public class Fibonacci {
    public static void main(String[] args) {
        Answer();
    }

    public static void Answer(){
        int primerNumero = 0;
        int segundoNumero=1;

        System.out.println(primerNumero);
        for (int i=0; i<9;i++){
            int temp = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = temp + segundoNumero;

        System.out.println(primerNumero );
        }

    }
}
