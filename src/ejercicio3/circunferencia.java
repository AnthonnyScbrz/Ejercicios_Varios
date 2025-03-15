package ejercicio3;
import java.sql.SQLOutput; // si no lo necesitas, bórralo
import java.util.Scanner;

public class circunferencia {
    public static final Double PI_VALUE=3.14; // ✅✅
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia : ");
        double radio = value.nextDouble();
        Answer(radio); // ❗❗❗ Los métodos siempre deberían comenzar por minúscula.

    }
    public static void Answer(double radio){
        double respuesta = radio*radio*PI_VALUE;
        System.out.println("El área de la circunferencia es: "+ respuesta);
    }
}
