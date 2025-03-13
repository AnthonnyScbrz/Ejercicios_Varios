package ejercicio6;

import java.util.Scanner;

public class par {
    public static void main(String[] args) {

        Scanner value= new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int number = value.nextInt();

        Answer(number);

    }
    public static void Answer(int number){
        if (number%2 ==0){
            System.out.println("ES PAR");
        }else {
            System.out.println("ES IMPAR");
        }
    }
}
