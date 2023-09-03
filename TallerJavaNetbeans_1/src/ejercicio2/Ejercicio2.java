package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*Escribir un programa que lea la hora en notación de 24 horas y 
       que imprima en notación de 12; por ejemplo, si la
       entrada es 13:45, la salida será 1:45 pm. El programa debe
       solicitar al usuario que introduzca exactamente cinco
       caracteres para especificar una hora; por ejemplo, las 9 en 
       punto se debe introducir así: 09:00.*/

        Scanner entrada = new Scanner(System.in);
        int Hora24;
        int Hora12;
        int min;
        String AM_PM;
        System.out.print("Ingrese la hora militar:");
        Hora24 = entrada.nextInt();
        System.out.print("Ingrese los minutos:");
        min = entrada.nextInt();
        if (Hora24 == 0) {
            Hora12 = 12;
            AM_PM = "AM";
        } else {
            if (Hora24 >= 12) {
                if (Hora24 == 12) {
                    Hora12 = Hora24;
                    AM_PM = "PM";
                } else {
                    Hora12 = Hora24 - 12;
                    AM_PM = "PM";
                }
            } else {
                Hora12 = Hora24;
                AM_PM = "AM";
            }
        }
        System.out.println("La hora militar " + Hora24 + ":" + min + " es igual en  formato AM/PM a " + Hora12 + ":" + min + " " + AM_PM);
    }
}
