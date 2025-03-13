package ejercicio15;

import java.util.Scanner;

public class PalindromoInt {
    public static void main(String[] args) {

        Answer();
    }
    public static void Answer(){
        Scanner value = new Scanner(System.in);
        System.out.print("Ingresa el número: " );
        int numero = value.nextInt();
        int reverso = 0;
        int numeroOriginal = numero;

        while (numero > 0){
            int resto = numero % 10;
            reverso = reverso * 10 + resto;
            numero /= 10;
        }

        if (reverso == numeroOriginal){
            System.out.println("Si es un numero palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
    }
}
