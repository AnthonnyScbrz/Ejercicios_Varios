package ejercicio9;

public class impares {
    public static void main(String[] args) {

        Answer();


    }

    public static void Answer(){

      int numero =0;
      while(numero<51){
          // Más semántico:
          // boolean esImpar = (!(numero%2==0));
          // if (esImpar)...
          if (!(numero%2==0)){

          System.out.println(numero);
          }
          numero++;
      }

    }

}
