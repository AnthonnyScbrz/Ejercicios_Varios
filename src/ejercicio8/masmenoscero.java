package ejercicio8;

import java.util.Scanner;

public class masmenoscero {
    public static void main(String[] args) {
            Answer();
    }

    public static void Answer(){

        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        double numero = value.nextDouble();

        if (numero <0){
            System.out.println("El número es negativo");
        }else if (numero>0){
            System.out.println("El número de positivo");
        }else {
            System.out.println("Es 0");
        }


    }

}
