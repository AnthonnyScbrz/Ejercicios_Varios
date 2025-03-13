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
              System.out.println("No es primo");
          } else {
              System.out.println("Es primo");
          }



    }
}
