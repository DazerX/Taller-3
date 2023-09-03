package ejercicio3;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Calcular la suma de los términos de la siguiente serie: 1/2 + 2/4 + 3/8 + ... + n/2^n
        Scanner entrada = new Scanner(System.in);
        int n;
        int i;
        double suma = 0;
        System.out.print("Ingrese el numero de datos a sumar: ");
        n = entrada.nextInt();
        for (i = 1; i <= n; i++) {
            suma = suma + (i / Math.pow(2, i));
        }
        System.out.println("La suma es: " + suma);
    }

}
