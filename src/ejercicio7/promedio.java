package ejercicio7;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
    Answer();

    }
    public static void Answer(){
        Scanner value = new Scanner(System.in);
        for (int i=1;i<4;i++){
            System.out.print("Ingrese el primer número: ");
            double numero1 = value.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = value.nextDouble();
            System.out.print("Ingrese el tercer número: ");
            double numero3 = value.nextDouble();

            double respuesta = (numero1+numero2+numero3)/3;
        System.out.println("El promedio es : "+ respuesta);
        }
    }
}
