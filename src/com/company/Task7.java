package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.06.2018.
 */
public class Task7 {
    public static void main(String[] args) {

        //Zad. 7 Napisz program, który oblicza pole koła.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane do obliczenia pola koła.");

        int r = scanner.nextInt();
        //double pi = 3.14;
        System.out.println("Pole koła wynosi: " + Math.PI*r*r);
        //zmienne stałe definiowane są z dużych liter >>PI

    }
}
