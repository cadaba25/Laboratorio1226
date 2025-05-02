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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese variable a: ");
        int letraUno=lea.nextInt();
        
        System.out.println("Ingrese variable b: ");
        int letraDos=lea.nextInt();
        
        System.out.println("Ingrese variable c: ");
        int letraTres=lea.nextInt();
        
        System.out.println("Ingrese variable d: ");
        int letraCuatro=lea.nextInt();
        
        System.out.println("Ingrese variable e: ");
        int letraCinco=lea.nextInt();
        
        System.out.println("Ingrese variable f: ");
        int letraSeis=lea.nextInt();
        
        System.out.println("Ingrese variable g: ");
        int letraSiete=lea.nextInt();
        
        System.out.println("Ingrese variable h: ");
        int letraOcho=lea.nextInt();
        
        System.out.println("Ingrese variable j: ");
        int letraNueve=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)(letraUno^2)/(letraDos-letraTres)+(letraCuatro-letraCinco)/((double)letraSeis-((double)(letraSiete*letraOcho)/letraNueve))));
        
        
        System.out.println("Ejercicio F");
        
        System.out.println("Ingresar m: ");
        int variableOne=lea.nextInt();
        
        System.out.println("ingresar n: ");
        int variableTwo=lea.nextInt();
        
        System.out.println("Ingresar p: ");
        int variableThree=lea.nextInt();
        
        System.out.print("Resultado: ");
        System.out.println(((double)variableOne/variableTwo)+(variableThree));
        
        
        
    }
    
}