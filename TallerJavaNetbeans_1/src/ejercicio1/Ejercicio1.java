package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Escribir un programa en java que solicite ingresar longitud y 
        //anchura de una habitación; hecho esto, visualice su
        //superficie con esos datos.
        Scanner entrada = new Scanner(System.in);
        double longitud;
        double anchura;
        double superficie;
        System.out.print("Digite la longitud:");
        longitud = entrada.nextDouble();
        System.out.print("Digite la anchura:");
        anchura = entrada.nextDouble();
        superficie = longitud * anchura;
        System.out.println("La superficie es:" + superficie);
    }

}
