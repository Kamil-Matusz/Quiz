package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import static com.company.Odpowiedzi.Wyświetl_odpowiedzi;
import static com.company.Pytania.Pytanie_1;
import static com.company.Pytania.Pytanie_2;
import static com.company.Pytania.Pytanie_3;
import static com.company.Pytania.Pytanie_4;
import static com.company.Pytania.Pytanie_5;
import static com.company.Pytania.Pytanie_6;
import static com.company.Pytania.Pytanie_7;
import static com.company.Pytania.Pytanie_8;
import static com.company.Pytania.Pytanie_9;
import static com.company.Pytania.Pytanie_10;
import static com.company.Wyniki.Wyświetl_wyniki;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filePath = ("D:\\Back-End\\Java\\Kółko Naukowe\\Quiz\\Wyniki\\Wyniki.txt");
        FileWriter fileWriter = null;
        int punkty = 0;
        int operacja;

        System.out.println("Witaj w Quiz Programistycznym :)");
        System.out.print("Podaj swoje Imię: ");
        String Imie = sc.nextLine();

        while (true) {
            System.out.println("Wybierz działanie");
            System.out.println("Nowa gra  - 1");
            System.out.println("Wyświetl najlepszych graczy - 2");
            System.out.println("Wyświetl odpowiedzi - 3");
            System.out.println("Wyjdź z gry - 0");
            operacja = sc.nextInt();

            switch (operacja) {
                case 1:
                    {
                        Pytanie_1();
                        System.out.print("Odpowiedź: ");
                        char c1 = sc.next().charAt(0);
                        boolean checkAlp1 = Character.isAlphabetic(c1);
                        if(!checkAlp1){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c1 = sc.next().charAt(0);
                        }
                        char answer1 =Character.toUpperCase(c1);
                        if (answer1 == 'C') {
                            punkty += 1;
                        }
                        System.out.println();

                        Pytanie_2();
                        System.out.print("Odpowiedź: ");
                        char c2 = sc.next().charAt(0);
                        boolean checkAlp2 = Character.isAlphabetic(c2);
                        if(!checkAlp2){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c2 = sc.next().charAt(0);
                        }
                        char answer2 =Character.toUpperCase(c2);
                        if (answer2 == 'B') {
                            punkty += 1;
                        }

                        Pytanie_3();
                        System.out.print("Odpowiedź: ");
                        char c3 = sc.next().charAt(0);
                        boolean checkAlp3 = Character.isAlphabetic(c3);
                        if(!checkAlp3){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c3 = sc.next().charAt(0);
                        }
                        char answer3 =Character.toUpperCase(c3);
                        if (answer3 == 'B') {
                            punkty += 1;
                        }

                        Pytanie_4();
                        char c4 = sc.next().charAt(0);
                        boolean checkAlp4 = Character.isAlphabetic(c4);
                        if(!checkAlp4){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c4 = sc.next().charAt(0);
                        }
                        char answer4 =Character.toUpperCase(c4);
                        if (answer4 == 'A') {
                            punkty += 1;
                        }

                        Pytanie_5();
                        char c5 = sc.next().charAt(0);
                        boolean checkAlp5 = Character.isAlphabetic(c5);
                        if(!checkAlp5){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c5 = sc.next().charAt(0);
                        }
                        char answer5 =Character.toUpperCase(c5);
                        if (answer5 == 'C') {
                            punkty += 1;
                        }

                        Pytanie_6();
                        char c6 = sc.next().charAt(0);
                        boolean checkAlp6 = Character.isAlphabetic(c6);
                        if(!checkAlp6){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c6 = sc.next().charAt(0);
                        }
                        char answer6 =Character.toUpperCase(c6);
                        if (answer6 == 'A') {
                            punkty += 1;
                        }

                        Pytanie_7();
                        char c7 = sc.next().charAt(0);
                        boolean checkAlp7 = Character.isAlphabetic(c7);
                        if(!checkAlp7){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c7 = sc.next().charAt(0);
                        }
                        char answer7 =Character.toUpperCase(c7);
                        if (answer7 == 'A') {
                            punkty += 1;
                        }

                        Pytanie_8();
                        char c8 = sc.next().charAt(0);
                        boolean checkAlp8 = Character.isAlphabetic(c8);
                        if(!checkAlp8){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c8 = sc.next().charAt(0);
                        }
                        char answer8 =Character.toUpperCase(c8);
                        if (answer8 == 'C') {
                            punkty += 1;
                        }

                        Pytanie_9();
                        char c9 = sc.next().charAt(0);
                        boolean checkAlp9 = Character.isAlphabetic(c9);
                        if(!checkAlp9){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c9 = sc.next().charAt(0);
                        }
                        char answer9 =Character.toUpperCase(c9);
                        if (answer9 == 'C') {
                            punkty += 1;
                        }

                        Pytanie_10();
                        char c10 = sc.next().charAt(0);
                        boolean checkAlp10 = Character.isAlphabetic(c10);
                        if(!checkAlp10){
                            System.out.print("Podana odpowiedż musi być literą, podaj odpowiedź jeszcze raz: ");
                            c10 = sc.next().charAt(0);
                        }
                        char answer10 =Character.toUpperCase(c10);
                        if (answer10 == 'A') {
                            punkty += 1;
                        }

                        System.out.println("Koniec gry");
                        System.out.println("Liczba uzyskanych punktów: " + punkty + " /10");

                        try {
                            File file = new File(filePath);

                            if (!file.exists()) file.createNewFile();

                            FileWriter fileWritter = new FileWriter(file, true);
                            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                            bufferWritter.write("-----------------");
                            bufferWritter.newLine();
                            bufferWritter.write("Imie gracza: " + Imie);
                            bufferWritter.newLine();
                            bufferWritter.write("Uzyskane punkty : " + punkty + "/10");
                            bufferWritter.newLine();
                            bufferWritter.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                case 2:
                    {
                    Wyświetl_wyniki();
                    break;
                    }
                case 3:
                     {
                         Wyświetl_odpowiedzi();
                     }
                case 0:
                     {
                    return;
                     }
                }
            }
        }
}
