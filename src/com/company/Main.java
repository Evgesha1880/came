package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            game();
        }
    }

    public static void game() {
        int kw = 0;
        int L = 0;
        int N = 0;
        System.out.println("Игрок 1, выбери: \n" +
                "1 камень \n" +
                "2 ножницы \n" +
                "3 бумага \n");
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();

        System.out.println("Игрок 2, выбери: \n" +
                "1 камень \n" +
                "2 ножницы \n" +
                "3 бумага \n");
        Scanner scanner1 = new Scanner(System.in);
        int p2 = scanner1.nextInt();

        System.out.println("Играем");

        if (p1 == 1) {
            if (p2 == 1) { N++; }
            else if (p2 == 2) {
                kw++;
            } else if (p2 == 3) {
                L++;
            }
        }
        if (p1 == 2) {
            if (p2 == 1) {
                L++;
            } else if (p2 == 2) { N++; }
            else if (p2 == 3) {
                kw++;
            }
        }
        if (p1 == 3) {
            if (p2 == 1) {
                kw++;
            } else if (p2 == 2) {
                L++;
            } else if (p2 == 3) { N++; }
        }
        if (kw == 1) {
            System.out.println("Вы выиграли");
        } else  if (L == 1) {
            System.out.println("Вы проиграли");
        }
        else if (N ==1) {
            System.out.println("Ничья");
        }
    }
}