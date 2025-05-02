/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lSemana2.pkg2;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
    // FECHAS
        
        
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Ingrese la primera fecha (Dia/Mes/Año):");
    String fecha1 = sc.nextLine();

    
    System.out.println("Ingrese la segunda fecha (Dia/Mes/Año):");
    String fecha2 = sc.nextLine();

    
    int dia1 = Integer.parseInt(fecha1.substring(0, 2));
    int mes1 = Integer.parseInt(fecha1.substring(3, 5));
    int anio1 = Integer.parseInt(fecha1.substring(6, 10));

    
    int dia2 = Integer.parseInt(fecha2.substring(0, 2));
    int mes2 = Integer.parseInt(fecha2.substring(3, 5));
    int anio2 = Integer.parseInt(fecha2.substring(6, 10));

    
    int totalDias1 = anio1 * 360 + mes1 * 30 + dia1;
    int totalDias2 = anio2 * 360 + mes2 * 30 + dia2;

    
    int diferencia = Math.abs(totalDias1 - totalDias2);

    
    System.out.println("Diferencia en dias: " + diferencia + " dias");
    }
}
