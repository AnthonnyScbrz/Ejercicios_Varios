package ejercicio16;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ContadorDigito {
    public static void main(String[] args) {
        Answer();
    }
    public static void Answer(){
        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int numero = value.nextInt();
        int contador=0;
        while(numero>0){
            numero /=10;
            contador++;
        }
        // "El número de dígitos del número X es Y"
        System.out.print(contador);
    }

}


