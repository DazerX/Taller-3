package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*Encontrar un número natural N más pequeño de forma que la suma de los N 
        primeros números exceda una cantidad
        introducida por el teclado.*/
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cantidad: ");
        int cantidadDeseada = entrada.nextInt();

        int suma = 0;
        int numeroNatural = 1;

        while (suma <= cantidadDeseada) {
            suma += numeroNatural;
            numeroNatural++;
           
        }
         System.out.println("El numero natural mas pequeno cuya suma de los N primeros numeros excede " + cantidadDeseada + " es " + (numeroNatural - 1));
    }

}
