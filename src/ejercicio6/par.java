package ejercicio6;

import java.util.Scanner;

// Algunas veces pones todo el nombre de la clase en mayúsculas...
// pero en otras ocasiones...
// La primera letra es la que está en mayúsculas; el resto, en minúsculas.
public class par {
    public static void main(String[] args) {

        Scanner value= new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int number = value.nextInt();

        Answer(number);

    }
    public static void Answer(int number){
        // Aprovecha para trabajar con booleanos.
        if (number%2 ==0){
            System.out.println("ES PAR");
        }else {
            System.out.println("ES IMPAR");
        }
    }
}
