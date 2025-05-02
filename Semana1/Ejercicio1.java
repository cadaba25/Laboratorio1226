/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_1_variables;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

      
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = lea.next();

      
        System.out.println("Ingrese el precio por hora: ");
        double tarifa = lea.nextDouble();

       
        System.out.println("Ingrese Horas laboradas en el mes: ");
        double horasmes = lea.nextDouble();

       
        double horasSemanal = horasmes / 4.0;  
        double salarioSemanal = horasSemanal * tarifa;

        System.out.println("----BOLETA DEL EMPLEADO----" +
                "\nNombre del empleado: " + nombre +
                "\nHoras de trabajo mensual: " + String.format("%.2f", horasmes) +
                "\nTarifa por hora: Lps. " + String.format("%.2f", tarifa) +
                "\nSalario del empleado semanal: Lps. " + String.format("%.2f", salarioSemanal));
    }
}