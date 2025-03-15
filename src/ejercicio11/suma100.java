package ejercicio11;

public class suma100 {
    public static void main(String[] args) {

        Answer();
    }

    public static void Answer(){
        int suma = 0;
        // El 0 es el elemento neutro de la suma (no aporta nada a la suma, vamos);
        // mejor empezar por 1
        for (int i=0;i<101;i++){
            suma = suma +i;
        }
        // "La suma de los primeros 100 números es..."
        System.out.println(suma);
    }
}
