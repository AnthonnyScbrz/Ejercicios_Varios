package ejercicio14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Answer();
    }
    public static void Answer(){
        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int numero = value.nextInt();
        int factorial = 1;
        for (int i = 1; i<=numero;i++){
            factorial *= i;
            System.out.println(factorial);
        }

    }
}
