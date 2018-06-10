package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.06.2018.
 */
public class Task5 {
    public static void main(String[] args) {
        //Zad. 5 Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich sumę.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pierwszą: ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj liczbę drugą: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Suma podanych liczb to: " + sum);

    }
}
