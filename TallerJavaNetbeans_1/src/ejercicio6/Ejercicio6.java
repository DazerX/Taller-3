package ejercicio6;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio6 {

    public static void main(String[] args) {
        //Escribir un programa para obtener la hipotenusa y los ángulos agudos
        //de un triángulo rectángulo a partir de las
        //longitudes de los catetos.
        Scanner entrada = new Scanner(System.in);
        float lado1;
        float lado2;
        float Hipotenusa;
        float angulo1;
        float angulo2;
        System.out.print("Ingresa el lado A: ");
        lado1 = entrada.nextFloat();
        System.out.print("Ingresa el lado B:");
        lado2 = entrada.nextFloat();
        Hipotenusa = (float) Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        angulo1 = (float) Math.toDegrees(Math.atan(lado1 / lado2));
        angulo2 = (float) Math.toDegrees(Math.atan(lado2 / lado1));
        System.out.println("La hipotenusa es: " + Hipotenusa);
        System.out.println("El angulo agudo 1 es: " + angulo1 + " grados");
        System.out.println("El angulo agudo 2 es: " + angulo2 + " grados");
    }

}
