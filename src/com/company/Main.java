package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Food menu = new Food("Soup");
        ArrayList<String> wordsA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("Введите название блюда: ");
            wordsA.add(i, scanner.next());

        }
        System.out.println(wordsA);

        ArrayList<String> wordsB = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            System.out.print("Введите слово: ");
            wordsB.add(i, scanner.next());

        }
        System.out.println(wordsB);

        ArrayList<String> wordsC = new ArrayList<>();
        wordsC.add(wordsA.get(0));
        wordsC.add(wordsB.get(4));
        wordsC.add(wordsA.get(1));
        wordsC.add(wordsB.get(3));
        wordsC.add(wordsA.get(2));
        wordsC.add(wordsB.get(2));
        wordsC.add(wordsA.get(3));
        wordsC.add(wordsB.get(1));
        wordsC.add(wordsA.get(4));
        wordsC.add(wordsB.get(0));
        System.out.println(wordsC);

        Collections.sort(wordsC, Comparator.comparingInt(String::length));
        System.out.println(wordsC);
    }
}
