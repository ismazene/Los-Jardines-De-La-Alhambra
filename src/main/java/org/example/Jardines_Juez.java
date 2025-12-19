package org.example;

import java.util.Scanner;

public class Jardines_Juez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        sc.nextLine();

        char[][] jardin = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {
            jardin[i] = sc.nextLine().toCharArray();
        }

        int resultado = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (jardin[i][j] == '#') {
                    resultado++;
                    jardin[i][j] = '.';

                    boolean cambio = true;
                    while (cambio) {
                        cambio = false;
                        for (int f = 0; f < filas; f++) {
                            for (int c = 0; c < columnas; c++) {
                                if (jardin[f][c] == '#') {
                                    if ((f > 0 && jardin[f - 1][c] == '.') ||
                                            (f < filas - 1 && jardin[f + 1][c] == '.') ||
                                            (c > 0 && jardin[f][c - 1] == '.') ||
                                            (c < columnas - 1 && jardin[f][c + 1] == '.')) {
                                        jardin[f][c] = '.';
                                        cambio = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(resultado);
    }
}
