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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //TIEMPO
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de segundos:");
        int segundos = sc.nextInt();

        if (segundos <= 0) {
            System.out.println("No se permite ese valor");
        } else {
            int horas = segundos / 3600;
            int segundosRestantes = segundos % 3600;
            int minutos = segundosRestantes / 60;
            int segundosFinales = segundosRestantes % 60;
            System.out.println("Tiempo: " + horas + " horas, " + minutos + " minutos, " + segundosFinales + " segundos.");
        
        
       }
    
}
}
