package ejercicio2;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Grados {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.print("Ingrese el valor en grados celsius: ");
        double grado = value.nextDouble();

        Answer(grado);
    }
     public static void Answer(double grado){
        double respuesta = (grado*1.8) +32;
         System.out.println(" La conversión a grados farenhaid es: "+ respuesta);
     }

}

