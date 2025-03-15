package ejercicio7;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
    Answer(); // ¿Por qué no pones toda la lógica aquí?

    }
    public static void Answer(){
        Scanner value = new Scanner(System.in);
        // Almacena los tres números en un array.
        for (int i=1;i<4;i++){
            System.out.print("Ingrese el primer número: ");
            double numero1 = value.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = value.nextDouble();
            System.out.print("Ingrese el tercer número: ");
            double numero3 = value.nextDouble();

            // double promedio = ...
            // Usa una clase Matemáticas para reutilizar esta operación.
            double respuesta = (numero1+numero2+numero3)/3;

            System.out.println("El promedio es : "+ respuesta);
        }
    }
}
