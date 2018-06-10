package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.06.2018.
 */
public class Task4 {

    public static void main(String[] args) {
        //Zad. 4 Napisz program, który odczytuje liczbę całkowitą i wypisuje ostatnią cyfrę liczby.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        //1349 =(1*10^3+3*10^2+4*10^1)+9
        System.out.println(number%10);



    }
}
