package com.company;

import java.util.Scanner;

public class Main {

    static String name1;
    static String name2;
    static String name3;

    public static void main(String[] args) {

        System.out.println("Привет, Дружок\n" +
                "    (⌒ω⌒)\n");
        start();
    }
    public static void start(){
        System.out.println("Для начала игры выбери режим:\n"+
                "1 Игра с другом \n"+
                "2 Игра с компьютером");
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();
        if (p1 ==1) {
            System.out.println("Для начала видите свои имена\n");
            Scanner p5 = new Scanner(System.in);
            name1 = p5.nextLine();
            Scanner p2 = new Scanner(System.in);
            name2 = p2.nextLine();
            System.out.println("Желаю тебя удачкки\n"+
                    "   ＼(≧▽≦)／\n" );
            go();
        }
        if (p1 == 2){
            System.out.println("Итак представтесь:\n");
            Scanner p6 = new Scanner(System.in);
            name3 = p6.nextLine();
            System.out.println("Желаю тебя удачкки\n"+
                    "   ＼(≧▽≦)／\n" );
            go2();
        }
        else {
            System.out.println("Введи коректное значение");
            start();
        }
    }
    public static int random(int a, int b){
        int random_number1 = a + (int) (Math.random() * b);
        System.out.println(random_number1);

        return random_number1;
    }
    public static void go() {
        game();
        System.out.println("Хотите ли вы продолжить игру?");
        Scanner ch = new Scanner(System.in);
        String playnext = ch.nextLine();
        if (playnext.equals("да")) {
            go();
        }
        else if (playnext.equals("нет")) {
            System.out.println("Спасибо, что были с нами))\n" +"         ♡(≧◡≦)♡");
        }
        else {
            System.out.println("Напишите точнее))\n"+"Можно ответить <да> или <нет>");
            System.out.println("Хотите ли вы продолжить игру?");
            ch = new Scanner(System.in);
            playnext = ch.nextLine();
            if (playnext.equals("да")) {
                go();
            }
            else if (playnext.equals("нет")) {
                System.out.println("Спасибо, что были с нами))\n" +"         ♡(≧◡≦)♡");
            }
        }

    }
    public static void go2() {
        gamecom();
        System.out.println("Хотите ли вы продолжить игру?");
        Scanner ch = new Scanner(System.in);
        String playnext = ch.nextLine();
        if (playnext.equals("да")) {
            go2();
        }
        else if (playnext.equals("нет")) {
            System.out.println("Спасибо, что были с нами))\n" +
                    "         ♡(≧◡≦)♡");
        }
        else {
            System.out.println("Напишите точнее))\n"+"Можно ответить <да> или <нет>");
            System.out.println("Хотите ли вы продолжить игру?");
            ch = new Scanner(System.in);
            playnext = ch.nextLine();
            if (playnext.equals("да")) {
                go();
            }
            else if (playnext.equals("нет")) {
                System.out.println("Спасибо, что были с нами))\n" +"         ♡(≧◡≦)♡");
            }
            }
        }
    public static void game() {
        int kw = 0;
        int L = 0;
        int N = 0;
        System.out.println( name1 + ", теперь выбери: \n" +
                "1 камень \n" +
                "2 ножницы \n" +
                "3 бумага \n");
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();

        System.out.println( name2 + " выбери: \n" +
                "1 камень \n" +
                "2 ножницы \n" +
                "3 бумага \n");
        Scanner scanner1 = new Scanner(System.in);
        int p2 = scanner1.nextInt();

        if (p1 == 1) {
            if (p2 == 1) {
                N++;
            } else if (p2 == 2) {
                kw++;
            } else if (p2 == 3) {
                L++;
            }
        }

        if (p1 == 2) {
            if (p2 == 1) {
                L++;
            } else if (p2 == 2) {
                N++;
            } else if (p2 == 3) {
                kw++;
            }
        }

        if (p1 == 3) {
            if (p2 == 1) {
                kw++;
            } else if (p2 == 2) {
                L++;
            } else if (p2 == 3) {
                N++;
            }
        }

        if (kw == 1) {
            System.out.println( name1 + ", вы выиграли \n" +
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░▄▄▄▄████████████▀▀█▄▄▄▄░\n"+
                    "░░░█▄░░████████████░░█░░░█░\n"+
                    "░░░░█░░████████████░▄█░░█░░\n"+
                    "░░░░░▀▄░██████████░░█░▄▀░░░\n"+
                    "░░░░░░░▀▀████████▀░█▀▀░░░░░\n"+
                    "░▄░░░░░░░░▀█████▀▄▀░░░░░▄█▄\n"+
                    "▀█▀░░░░░░░░░▀███▀░░░░░░░░▀░\n"+
                    "░░░░░░░▄░░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░▀█▀░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░░░░░░░░▄█▄░░░░░░░░░░░\n"+
                    "░░░░░░░░░░▄▄▄███▄▄▄░░░░░░░░\n"+
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░░░████▀▀▀▀▀▀▀████░░░░░\n"+
                    "░░░░░░░███░░░░░░░░░███░░░░░\n"+
                    "░░░░░░░████▄▄▄▄▄▄▄████░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░\n");
        } else if (L == 1) {
            System.out.println( name2 + ", вы выйграли\n"+
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░▄▄▄▄████████████▀▀█▄▄▄▄░\n"+
                    "░░░█▄░░████████████░░█░░░█░\n"+
                    "░░░░█░░████████████░▄█░░█░░\n"+
                    "░░░░░▀▄░██████████░░█░▄▀░░░\n"+
                    "░░░░░░░▀▀████████▀░█▀▀░░░░░\n"+
                    "░▄░░░░░░░░▀█████▀▄▀░░░░░▄█▄\n"+
                    "▀█▀░░░░░░░░░▀███▀░░░░░░░░▀░\n"+
                    "░░░░░░░▄░░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░▀█▀░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░░░░░░░░▄█▄░░░░░░░░░░░\n"+
                    "░░░░░░░░░░▄▄▄███▄▄▄░░░░░░░░\n"+
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░░░████▀▀▀▀▀▀▀████░░░░░\n"+
                    "░░░░░░░███░░░░░░░░░███░░░░░\n"+
                    "░░░░░░░████▄▄▄▄▄▄▄████░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░\n");
        } else if (N == 1) {
            System.out.println("У вас ничья");
        }
    }
    public static void gamecom() {
        int kw = 0;
        int L = 0;
        int N = 0;
        System.out.println( name3 + ", выбери: \n" +
                "1 камень \n" +
                "2 ножницы \n" +
                "3 бумага \n");
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();

        System.out.println("Твой противник выбирает");

        int p2 = random(1, 3);
        if (p1 == 1) {
            if (p2 == 1) {
                N++;
            } else if (p2 == 2) {
                kw++;
            } else if (p2 == 3) {
                L++;
            }
        }
        if (p1 == 2) {
            if (p2 == 1) {
                L++;
            } else if (p2 == 2) {
                N++;
            } else if (p2 == 3) {
                kw++;
            }
        }
        if (p1 == 3) {
            if (p2 == 1) {
                kw++;
            } else if (p2 == 2) {
                L++;
            } else if (p2 == 3) {
                N++;
            }
        }
        if (kw == 1) {
            System.out.println("Вы " + name3 + " выиграли \n" +
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░▄▄▄▄████████████▀▀█▄▄▄▄░\n"+
                    "░░░█▄░░████████████░░█░░░█░\n"+
                    "░░░░█░░████████████░▄█░░█░░\n"+
                    "░░░░░▀▄░██████████░░█░▄▀░░░\n"+
                    "░░░░░░░▀▀████████▀░█▀▀░░░░░\n"+
                    "░▄░░░░░░░░▀█████▀▄▀░░░░░▄█▄\n"+
                    "▀█▀░░░░░░░░░▀███▀░░░░░░░░▀░\n"+
                    "░░░░░░░▄░░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░▀█▀░░░░░█░░░░░░░░░░░░\n"+
                    "░░░░░░░░░░░░░▄█▄░░░░░░░░░░░\n"+
                    "░░░░░░░░░░▄▄▄███▄▄▄░░░░░░░░\n"+
                    "░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░░░████▀▀▀▀▀▀▀████░░░░░\n"+
                    "░░░░░░░███░░░░░░░░░███░░░░░\n"+
                    "░░░░░░░████▄▄▄▄▄▄▄████░░░░░\n"+
                    "░░░░░░░███████████████░░░░░\n"+
                    "░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░\n");
        } else if (L == 1) {
            System.out.println("Вы " + name3 + " проиграли\n"+
                    "░░░░░░░░░░░█████████████░░░░░░\n" +
                    "░░░░░░░░░███░███░░░░░░██░░░░░░\n" +
                    "░░░░██████░░░░██░██████████░░░\n" +
                    "░░░█████░░░░░░████░░░░░░░██░░░\n" +
                    "░░██░░░░░░░░░░██░░███████████░\n" +
                    "░░██░░░░░░░░░░░███░░░░░░░░░██░\n" +
                    "░░██░░░░░░░░░░░███░██████████░\n" +
                    "░░██░░░░░░░░░░░░████░░░░░░░██░\n" +
                    "░░██░░░░░░░░░░░░░███░█████░░██\n" +
                    "░░░██████░░░░░░░░░░████░░░░░██\n" +
                    "░░░░░░░░███░░░░░░░░░░░░█████░░\n" +
                    "░░░░░░░░░███░░░░░░░██████░░░░░\n" +
                    "░░░░░░░░░░░██░░░░░░██░░░░░░░░░\n" +
                    "░░░░░░░░░░░░███░░░░░██░░░░░░░░\n" +
                    "░░░░░░░░░░░░░░██░░░░██░░░░░░░░\n" +
                    "░░░░░░░░░░░░░░░███░░░██░░░░░░░\n" +
                    "░░░░░░░░░░░░░░░░░██░░░██░░░░░░\n" +
                    "░░░░░░░░░░░░░░░░░██░░░██░░░░░░\n" +
                    "░░░░░░░░░░░░░░░░░░██░██░░░░░░░\n" +
                    "░░░░░░░░░░░░░░░░░░████░░░░░░░░");
        } else if (N == 1) {
            System.out.println("У вас ничья");
        }
    }
}