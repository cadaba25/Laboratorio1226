/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_1_variables;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        double totalprecio =0,totalclicks = 0 , totalisv= 0;
        System.out.println("Ingrese la cantidad total de clicks: ");
        int totalesclicks = lea.nextInt();
        
        System.out.println("Ingrese los clicks1: ");
        int clicks1 = lea.nextInt();
        System.out.println("Ingrese el precio de clicks1");
        double precio1 = lea.nextDouble();
        
        System.out.println("Ingrese los clicks2: ");
        int clicks2 = lea.nextInt();
        System.out.println("Ingrese el precio de clicks2");
        double precio2 = lea.nextDouble();
        
        System.out.println("Ingrese los clicks3: ");
        int clicks3 = lea.nextInt();
        System.out.println("Ingrese el precio de clicks3");
        double precio3 = lea.nextDouble();
               
        totalprecio= precio1 + precio2 + precio3; 
        totalclicks = (clicks1*precio1)+(clicks2*precio2)+(precio3*clicks3);
        double promedio = totalclicks/totalesclicks ;
        double isv = totalclicks*0.16;
        totalisv = totalclicks + isv;
        
        System.out.println("Precio promedio de clicks: " + String.format(" %.2f", promedio));
        System.out.println("ISV Total: " + String.format( "%.2f", totalisv));
        
        
    }
    
}