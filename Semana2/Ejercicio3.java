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
public class Ejercicio3 {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Ingrese codigo del empleado:");
    int codigo = sc.nextInt();

    sc.nextLine(); 

    System.out.println("Ingrese nombre del empleado:");
    String nombre = sc.nextLine();

    System.out.println("Ingrese apellido del empleado:");
    String apellido = sc.nextLine();

    System.out.println("Ingrese horas trabajadas:");
    int horas = sc.nextInt();

    System.out.println("Seleccione categoria del empleado:");
    System.out.println("1. Categoria 1 (Extra $40 por hora)");
    System.out.println("2. Categoria 2 (Extra $50 por hora)");
    System.out.println("3. Categoria 3 (Extra $85 por hora)");
    System.out.println("4. Categoria 4 (No recibe horas extra)");
    int categoria = sc.nextInt();

    double pagoNormal = 35.99;
    double totalPago = 0;
    int horasExtra = 0;

    if (horas > 40) {
      horasExtra = horas - 40;
      if (horasExtra > 15) {
        horasExtra = 15; 
      }
      horas = 40;
    }

    totalPago = horas * pagoNormal;

    
    switch (categoria) {
      case 1:
        totalPago += horasExtra * 40;
        break;
      case 2:
        totalPago += horasExtra * 50;
        break;
      case 3:
        totalPago += horasExtra * 85;
        break;
      case 4:
        horasExtra = 0;
        
        break;
      default:
        System.out.println("Categoria incorrecta");
        return;
    }

    
    System.out.println("\n----- Pago -----");
    System.out.println("Codigo del empleado: " + codigo);
    System.out.println("Nombre completo: " + nombre + " " + apellido);
    System.out.println("Categoria: " + categoria);
    System.out.println("Horas normales pagadas: " + horas);
    System.out.println("Horas extra pagadas: " + horasExtra);
    System.out.println("Pago total: $" + totalPago);
    
    
}

