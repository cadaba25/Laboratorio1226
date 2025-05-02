/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_1_variables;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double total = 0, cuotaMeses = 0, conversion = 0;

        System.out.println("Ingrese el monto del prestamo: ");
        double prestamo = lea.nextDouble();

        System.out.println("Ingrese el plazo de pago en meses: ");
        int plazo = lea.nextInt();

        System.out.println("Ingrese el interes mensual (%): ");
        double interes = lea.nextDouble();

        conversion = interes / 100;
        total = prestamo * conversion;
        cuotaMeses = (prestamo / plazo) + total;
        double totalPagar = cuotaMeses * plazo;

        System.out.println("***CUOTAS MENSUALES***" + 
                "\nCuota de pago mensual: HNL " + String.format("%.2f", cuotaMeses) + 
                "\nPlazo de pago " + plazo + " meses " + 
                "\nTotal a pagar: HNL "  + String.format("%.2f", totalPagar));
    }
}
