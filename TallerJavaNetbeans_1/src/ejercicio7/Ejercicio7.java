/*Crear un programa que valore el salario neto semanal de los trabajadores 
de una empresa de acuerdo a las siguientes normas:
• Horas semanales trabajadas <38 a una tasa de .
• Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
• Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 10%, 
si el salario bruto es mayor que 750 euros.
Lea los datos necesarios para calcular el salario de un trabajador*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int HorasT;
        double TasaOr, SalarioBruto, SalarioTotal, aumentado, agregado, Impuesto = 0;
        System.out.print("Ingrese las horas trabajadas");
        HorasT = entrada.nextInt();

        System.out.print("Ingrese la tasa ordinaria por hora");
        TasaOr = entrada.nextDouble();
        if (HorasT < 38) {
            SalarioBruto = HorasT * TasaOr;
        } else {
            agregado = TasaOr * 0.5;
            aumentado = TasaOr + agregado;
            SalarioBruto = HorasT * agregado;
        }
        if (SalarioBruto <= 750) {
            SalarioTotal = SalarioBruto;
        } else {
            Impuesto = SalarioBruto * 0.1;
            SalarioTotal = SalarioBruto - Impuesto;
        }
        System.out.println("Salario bruto: " + SalarioBruto + " euros");
        System.out.println("Impuestos: " + Impuesto + " euros");
        System.out.println("Salario neto: " + SalarioTotal + " euros");
    }
}


