package ejercicio12;

import java.util.Scanner;

public class multipl {
    public static void main(String[] args) {
        Answer();

    }

    public static void Answer(){
        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int numero = value.nextInt();

        for (int i=0; i<11;i++){
            System.out.println( numero +" x "+ i + " = " + numero*i);
        }

    }
}
