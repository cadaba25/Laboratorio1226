/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebalab;

import java.util.Scanner;

public class Barreda_Carlos_Estructuras {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opcionMenu;

        do {
            System.out.println("\n-- MENU --");
            System.out.println("(1) Cifrado Cesar");
            System.out.println("(5) Salir");
            System.out.print("Opcion: ");
            opcionMenu = lea.nextInt();

            lea.nextLine();

            switch (opcionMenu) {

                case 1:
                    String texto;
                    int numCesar;
                    String textoCifrado = " ";

                    System.out.println("--- CIFRADO CESAR ---");
                    System.out.print("Ingrese la cadena de texto: ");
                    texto = lea.nextLine();

                    System.out.print("Ingrese un numero positivo entero para el desplazamiento: ");
                    numCesar = lea.nextInt();
                    lea.nextLine();

                    for (int i = 0; i < texto.length(); i++) {
                        char letra = texto.charAt(i);

                        if (letra >= 'A' && letra <= 'Z') {
                            letra = (char) ((letra - 'A' + numCesar) % 26 + 'A');
                        } else if (letra >= 'a' && letra <= 'z') {
                            letra = (char) ((letra - 'a' + numCesar) % 26 + 'a');
                        }

                        textoCifrado += letra;
                    }

                    System.out.println("Frase cifrada: " + textoCifrado);
                    break;

                case 2:
                    System.out.println("Ingrese una Frase: ");
                    String Frase = lea.nextLine() + " ";

                    System.out.println("Ingrese el Limite de la palabra a imprimir");
                    int limite = lea.nextInt();

                    System.out.println("Las palabras que superan el limite de " + limite + " son:");
                    int inicio = 0;
                    for (int i = 0; i < Frase.length(); i++) {
                        if (Frase.charAt(i) == ' ') {
                            String Palabra_Pasable = Frase.substring(inicio, i);
                            if (Palabra_Pasable.length() >= limite) {
                                System.out.println(Palabra_Pasable);
                            }
                            inicio = i + 1;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion");
            }

        } while (opcionMenu != 5);
    }
}
