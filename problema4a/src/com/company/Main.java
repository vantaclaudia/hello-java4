package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, d = 0;
        String guess = " ";
        System.out.println("Numele: ");
        Scanner nume = new Scanner(System.in);
        String Name = nume.nextLine();
        for (i = 0; i < 100; i++) {
            System.out.println(" ");
        }
        while (d == 0) {
            System.out.println("Ghiceste numele: ");
            guess = nume.nextLine();
            if (guess.compareTo(Name) == 0) {
                d = 1;
            } else {
                System.out.println("Mai incearca.");
            }
        }
        System.out.println("Merge.");
    }
}
