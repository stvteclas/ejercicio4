package domain;

public class Ejercicio4 {
    public static void main(String[] args) {
       int numeroIf = 30;
       int numeroWhile = 0;
       int numeroDo = 32;
       int numeroFor;
       var estacion = "Invierno";


       if(numeroIf == 0){
           System.out.println("El numero es cero = " + numeroIf);
       } else if (numeroIf > 0) {
           System.out.println("El numero es positivo = " + numeroIf);
       }else {
           System.out.println("El numero es negativo = " + numeroIf);
       }

       while (numeroWhile<3){
           System.out.println("numeroWhile = " + numeroWhile);
           numeroWhile++;
       }
       do {
           System.out.println("numeroDo = " + numeroDo);
       }while (numeroDo < 0);
       for(numeroFor = 0; numeroFor<=3; numeroFor++){
           System.out.println("El numero es = " + numeroFor);
       }

       switch (estacion){
           case "Invierno":
               System.out.println("La estacion es= " + estacion);
               break;
           case "verano":
               System.out.println("La estacion es= " + estacion);
               break;
           case"Otoño":
               System.out.println("La estacion es= " + estacion);
               break;
           case "Primavera":
               System.out.println("La estacion es= " + estacion);
               break;
           default:
               System.out.println("No ha ingresado una estacion valida");


       }

    }
}
