/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Carlos_Barreda_Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int opcion;
        int contadorPalabraAlRevez = 0;
        int numeroPerfecto = 0;
        int contPrimos = 0;
        int contVotaciones = 0;

        do {
            System.out.println("--MENU--");
            System.out.println("(1) Palabra Alrevez");
            System.out.println("(2) Numero Perfecto");
            System.out.println("(3) Primos");
            System.out.println("(4) Votaciones");
            System.out.println("(5) Salir");
            System.out.println("  ");
            System.out.print("Opcion:");
            opcion = lea.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Cuantas palabras ingresara?: ");
                    int cantidad = lea.nextInt();
                    

                    String palabraLarga = "";

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese una palabra: ");
                        String palabra = lea.nextLine();

                        String invertida = "";
                        for (int j = palabra.length() - 1; j >= 0; j--) {
                            invertida += palabra.charAt(j);
                        }

                        System.out.println("Palabra al reves: " + invertida);

                        if (palabra.length() > palabraLarga.length()) {
                            palabraLarga = palabra;
                        }

                        if (palabra.equals(invertida)) {
                            System.out.println("--La palabra es palindromo--");
                        } else {
                            System.out.println("--La palabra NO es palindromo--");
                        }
                    }
                    System.out.println(" ");
                    System.out.println("La palabra mas larga fue: " + palabraLarga);
                    System.out.println(" ");

                    contadorPalabraAlRevez++;

                    break;

                case 2:

                    System.out.print("Ingrese numero para verificar si es perfecto: ");
                    int num = lea.nextInt();
                    int suma = 0;

                    for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                            suma += i;
                        }
                    }

                    if (suma == num) {
                        System.out.println("El numero es perfecto ");
                    } else {
                        System.out.println("El numero NO es perfecto ");
                    }

                    numeroPerfecto++;

                    break;

                case 3:

                    System.out.println("Primos");
                    Random random = new Random();
                    int numeroAleatorio = random.nextInt(100);

                    boolean esPrimo = true;

                    for (int i = 2; i <= Math.sqrt(numeroAleatorio); i++) {
                        if (numeroAleatorio % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo && numeroAleatorio > 1) {
                        System.out.println("El numero: " + numeroAleatorio + " es primo");
                    } else {
                        System.out.println("El numero: " + numeroAleatorio + " no es primo");
                    }

                    contPrimos++;

                    break;

                case 4:
                    contVotaciones++;

                    int votantes;
                    int votosAzul = 0;
                    int votosRojo = 0;
                    int votosNegro = 0;
                    int votosAmarillo = 0;
                    int votosNulos = 0;

                    System.out.println("Votaciones");
                    System.out.print("Ingrese la cantidad de votantes en el pais: ");
                    votantes = lea.nextInt();
                    

                    for (int i = 0; i < votantes; i++) {
                        System.out.print("Ingrese su voto (AZUL, AMARILLO, NEGRO, ROJO): ");
                        String voto = lea.nextLine().toUpperCase();

                        if (voto.equals("AZUL")) {
                            votosAzul++;
                        } else if (voto.equals("ROJO")) {
                            votosRojo++;
                        } else if (voto.equals("NEGRO")) {
                            votosNegro++;
                        } else if (voto.equals("AMARILLO")) {
                            votosAmarillo++;
                        } else {
                            votosNulos++;
                        }
                    }

                    int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                    if (votosValidos >= (votantes * 0.6)) {
                        if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                            System.out.println("Planilla ganadora: AZUL");
                        } else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                            System.out.println("Planilla ganadora: ROJO");
                        } else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                            System.out.println("Planilla ganadora: NEGRO");
                        } else if (votosAmarillo > votosAzul && votosAmarillo > votosRojo && votosAmarillo > votosNegro) {
                            System.out.println("Planilla ganadora: AMARILLO");
                        }
                    } else {
                        System.out.println("VOTACION FALLIDA");
                    }
                    
                    contVotaciones++;

                    break;

                case 5:
                    System.out.println("Entro " + contadorPalabraAlRevez + " veces a contador al revez");
                    System.out.println("Entro " + numeroPerfecto + " veces a Numero perfecto");
                    System.out.println("Entro " + contPrimos + " veces a numeros primos");
                    System.out.println("Entro " + contVotaciones + " veces a votaciones");
                    break;

            }

        } while (opcion != 5);

    }

}
