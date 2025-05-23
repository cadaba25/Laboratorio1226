/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenlab;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author David Barreda
 */
public class ExamenLab {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        int opcionMenu;

        do {
            System.out.println("--Menu--");
            System.out.println("(1)Piramide ");
            System.out.println("(2)Clave");
            System.out.println("(3)Juego Piedra papel o tijera");
            System.out.println("(4)Adivinar");
            System.out.println("(5)SALIR");
            System.out.print("Opcion = ");
            opcionMenu = lea.nextInt();

            switch (opcionMenu) {
                case 1:
                    int fila;
                    int numero = 1;

                    System.out.println("-----");
                    System.out.println("Piramide");
                    System.out.print("Ingrese la cantidad de fila de la piramide: ");
                    fila = lea.nextInt();

                    for (int i = 1; i <= fila; i++) {
                        int sumas = 0;
                        for (int j = 0; j < i; j++) {
                            System.out.print(numero + " ");
                            sumas += numero;
                            numero += 2;
                        }
                        System.out.println("= " + sumas);
                    }

                    break;

                case 2:
                    int menuClave;

                    do {
                        System.out.println("------");
                        System.out.println("Clave");
                        System.out.println("(1) Cifrar");
                        System.out.println("(2) Descifrar");
                        System.out.println("(3) Salir");
                        System.out.print("Opcion = ");

                        menuClave = lea.nextInt();
                        lea.nextLine();

                        if (menuClave == 1) {
                            String cifrado;

                            System.out.println("-----");
                            System.out.print("Ingrese mensaje de texto que desea cifrar: ");
                            cifrado = lea.nextLine();

                            String resultado1 = "";
                            for (int i = 0; i < cifrado.length(); i++) {
                                char letra = cifrado.charAt(i);
                                if (letra >= 'a' && letra <= 'z') {
                                    resultado1 += (char) ('z' - (letra - 'a'));
                                } else if (letra >= 'A' && letra <= 'Z') {
                                    resultado1 += (char) ('Z' - (letra - 'A'));
                                } else {
                                    resultado1 += letra;
                                }
                            }

                            System.out.println("Texto cifrado: " + resultado1);

                        } else if (menuClave == 2) {
                            String descifrado;

                            System.out.println("-----");
                            System.out.print("Ingrese mensaje de texto para descifrar: ");
                            descifrado = lea.nextLine();

                            String resultado2 = "";
                            for (int i = 0; i < descifrado.length(); i++) {
                                char letra1 = descifrado.charAt(i);
                                if (letra1 >= 'a' && letra1 <= 'z') {
                                    resultado2 += (char) ('z' - (letra1 - 'a'));
                                } else if (letra1 >= 'A' && letra1 <= 'Z') {
                                    resultado2 += (char) ('Z' - (letra1 - 'A'));
                                } else {
                                    resultado2 += letra1;
                                }
                            }

                            System.out.println("Texto descifrado: " + resultado2);
                        }

                    } while (menuClave != 3);

                    break;

                case 3:
                    String jugador;
                    int computadora = 0;

                    System.out.println("--Bienvenido a piedra papel o tijeras");

                    while (true) {
                        System.out.println("-----");
                        System.out.println("Ingrese: Piedra, Papel o Tijera ");
                        jugador = lea.next().toLowerCase();

                        while (!"piedra".equals(jugador) && !"papel".equals(jugador) && !"tijera".equals(jugador)) {
                            System.out.println("Opcion no valida");

                            System.out.println("Ingrese piedra papel o tijera");
                            jugador = lea.next().toLowerCase();

                        }

                        computadora = random.nextInt(3);
                        String eleccionComputadora;

                        if (computadora == 0) {
                            eleccionComputadora = "piedra";
                        } else if (computadora == 1) {
                            eleccionComputadora = "papel";
                        } else {
                            eleccionComputadora = "tijera";
                        }

                        System.out.println("Computadora:" + eleccionComputadora);

                        if (jugador.equals(eleccionComputadora)) {

                            System.out.println("Empate");

                        } else if (jugador.equals("piedra") && eleccionComputadora.equals("tijera")) {
                            System.out.println("Gana el JUGADOR");
                        } else if (jugador.equals("tijera") && eleccionComputadora.equals("papel")) {
                            System.out.println("Gana el JUGADOR");
                        } else if (jugador.equals("papel") && eleccionComputadora.equals("piedra")) {
                            System.out.println("Gana el JUGADOR");

                        } else {
                            System.out.println("Gana la COMPUTADORA");
                        }

                        System.out.println("desea jugar de nuevo? (si/no)");
                        String jugarDeNuevo = lea.next().toLowerCase();

                        if (!"si".equals(jugarDeNuevo)) {
                            System.out.println("Cerrando piedra papel o tijera");
                            break;
                        }

                    }
                    break;

                case 4:

                    int numUsuario = 0;
                    int intentos = 0;
                    int numSecreto = random.nextInt(101);

                    System.out.println("-----");
                    System.out.println("ADIVINAR");
                    System.out.print("Ingresa un numero del 1-100: ");

                    while (intentos < 10 && numSecreto != numUsuario) {
                        intentos++;

                        System.out.println("Intentos: " + intentos);

                        numUsuario = lea.nextInt();

                        if (numUsuario == numSecreto) {
                            System.out.println("Adivinaste el numero secreto");
                            System.out.println("En " + intentos + "intentos");

                        } else if (numUsuario < numSecreto) {
                            System.out.println("El numero es mayor");

                        } else if (numUsuario > numSecreto) {
                            System.out.println("El numero es menor");

                        }
                    }

                    if (numUsuario != numSecreto) {
                        System.out.println("Perdiste, el numero secreto era: " + numSecreto);
                    }

                case 5:
                    System.out.println("Saliendo");
                    break;

            }

        } while (opcionMenu != 5);

    }
}
