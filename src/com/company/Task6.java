package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.06.2018.
 */
public class Task6 {
    public static void main(String[] args) {

    /*Zad. 6  Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich iloraz
        (zmiennoprzecinkowy).*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj liczbę całkowitą: ");
        int num2 = scanner.nextInt();

        double score = (double) num1/num2;

        System.out.println("Iloraz (zmiennoprzecnikowych) podanych liczb, to: " + score);


    }
}
