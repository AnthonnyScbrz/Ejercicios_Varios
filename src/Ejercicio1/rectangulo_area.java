package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class rectangulo_area {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner value = new Scanner(System.in);
        System.out.print("Ingrese Largo: ");
        double firstNumber = value.nextDouble();
        System.out.print("Ingrese Ancho: ");
        double secondNumber = value.nextDouble();

       Answer(firstNumber,secondNumber);

    }

    public static void Answer(double firstNumber, double secondNumber){
        double resultado =  firstNumber * secondNumber;
        System.out.println("El área es: " + resultado);
    }
}