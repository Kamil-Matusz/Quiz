package com.company;

import java.io.*;
import java.util.Scanner;

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
                        if (c1 == 'C') {
                            punkty = punkty + 1;
                        }
                        System.out.println();

                        Pytanie_2();
                        System.out.print("Odpowiedź: ");
                        char c2 = sc.next().charAt(0);
                        if (c2 == 'B') {
                            punkty = punkty + 1;
                        }

                        Pytanie_3();
                        System.out.print("Odpowiedź: ");
                        char c3 = sc.next().charAt(0);
                        if (c3 == 'B') {
                            punkty = punkty + 1;
                        }

                        Pytanie_4();
                        char c4 = sc.next().charAt(0);
                        if (c4 == 'A') {
                            punkty = punkty + 1;
                        }

                        Pytanie_5();
                        char c5 = sc.next().charAt(0);
                        if (c5 == 'C') {
                            punkty = punkty + 1;
                        }

                        Pytanie_6();
                        char c6 = sc.next().charAt(0);
                        if (c6 == 'A') {
                            punkty = punkty + 1;
                        }

                        Pytanie_7();
                        char c7 = sc.next().charAt(0);
                        if (c6 == 'A') {
                            punkty = punkty + 1;
                        }

                        Pytanie_8();
                        char c8 = sc.next().charAt(0);
                        if (c8 == 'C') {
                            punkty = punkty + 1;
                        }

                        Pytanie_9();
                        char c9 = sc.next().charAt(0);
                        if (c9 == 'C') {
                            punkty = punkty + 1;
                        }

                        Pytanie_10();
                        char c10 = sc.next().charAt(0);
                        if (c10 == 'A') {
                            punkty = punkty + 1;
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
