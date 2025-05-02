/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lSemana2.pkg2;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Ejercicio1 {
    // CLASES 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la fecha actual (dia, DD/MM):");
    String fecha = sc.nextLine();

    int coma = fecha.indexOf(",");
    String diaSemana = fecha.substring(0, coma).toLowerCase().trim();
    String numeros = fecha.substring(coma + 1).trim();

    int barra = numeros.indexOf("/");
    int dia = Integer.parseInt(numeros.substring(0, barra));
    int mes = Integer.parseInt(numeros.substring(barra + 1));

    if ((!(diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles") || diaSemana.equals("jueves") || diaSemana.equals("viernes"))) || dia > 31 || mes > 12) {
      System.out.println("Se produjo un error");
      return;
    }

    if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles")) {
      System.out.println("Hubo examen? (si/no)");
      String examen = sc.nextLine().toLowerCase();

      if (examen.equals("si")) {
        System.out.println("Alumnos aprobados:");
        int aprobados = sc.nextInt();
        System.out.println("Alumnos reprobados:");
        int reprobados = sc.nextInt();

        int total = aprobados + reprobados;
        int porcentaje = (aprobados * 100) / total;

        System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
      }

    } else if (diaSemana.equals("jueves")) {
      System.out.println("Ingrese porcentaje de asistencia:");
      int asistencia = sc.nextInt();

      String resultado = asistencia > 50 ? "Asistio la mayoria" : "No asistio la mayoria";
      System.out.println(resultado);

    } else if (diaSemana.equals("viernes")) {
      if ((dia == 1 && (mes == 1 || mes == 7))) {
        System.out.println("Comienzo de nuevo ciclo");

        System.out.println("Cantidad de alumnos:");
        int alumnos = sc.nextInt();

        System.out.println("Precio por alumno:");
        int precio = sc.nextInt();

        System.out.println("Ingreso total: $" + (alumnos * precio));
      }
    }

    
    System.out.println("Ingrese cantidad de segundos:");
    int segundos = sc.nextInt();

    if (segundos <= 0) {
      System.out.println("No se permite ese valor");
      return;
    }

    int horas = segundos / 3600;
    int restante = segundos % 3600;
    int minutos = restante / 60;
    int segRestantes = restante % 60;

    System.out.println("Tiempo: " + horas + " horas, " + minutos + " minutos, " + segRestantes + " segundos.");
      
    }
}

