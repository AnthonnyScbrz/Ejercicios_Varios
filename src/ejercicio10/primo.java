package ejercicio10;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {

    Answer();

    }
    public static void Answer(){

        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int numero = value.nextInt();

          if (numero%2==0){
            // No es cierto: el 2, que es par, SÍ es primo.
            System.out.println("No es primo");
          } else {
            // No es cierto: el 15, que es impar, no es primo.
            System.out.println("Es primo");
          }



    }
}
