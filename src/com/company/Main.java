package com.company;

import java.io.*;
import java.util.Scanner;

import static com.company.Pytania.Pytanie_1;
import static com.company.Pytania.Pytanie_2;
import static com.company.Pytania.Pytanie_3;
import static com.company.Pytania.Pytanie_4;
import static com.company.Pytania.Pytanie_5;
import static com.company.Pytania.Pytanie_6;
import static com.company.Pytania.Pytanie_7;
import static com.company.Pytania.Pytanie_8;
import static com.company.Wyniki.Wyświetl_wyniki;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filePath = ("D:\\Back-End\\Java\\Kółko Naukowe\\Quiz\\Wyniki\\Wyniki.txt");
        FileWriter fileWriter = null;
        int punkty=0;

	    System.out.println("Witaj w Quiz Programistycznym :)");
        System.out.print("Podaj swoje Imię: ");
        String Imie = sc.nextLine();


        Pytanie_1();
        System.out.print("Odpowiedź: ");
        char c1 = sc.next().charAt(0);
        if(c1 == 'C') {
            punkty = punkty +1;
        }
        System.out.println();

        Pytanie_2();
        System.out.print("Odpowiedź: ");
        char c2 = sc.next().charAt(0);
        if(c2 == 'B') {
            punkty = punkty +1;
        }

        Pytanie_3();
        System.out.print("Odpowiedź: ");
        char c3 = sc.next().charAt(0);
        if(c3 == 'B') {
            punkty = punkty +1;
        }

        Pytanie_4();
        char c4 = sc.next().charAt(0);
        if(c4 == 'A') {
            punkty = punkty +1;
        }

        Pytanie_5();
        char c5 = sc.next().charAt(0);
        if(c5 == 'C') {
            punkty = punkty +1;
        }

        Pytanie_6();
        char c6 = sc.next().charAt(0);
        if(c6 == 'A') {
            punkty = punkty +1;
        }

        Pytanie_7();
        char c7 = sc.next().charAt(0);
        if(c6 == 'A') {
            punkty = punkty +1;
        }

        Pytanie_8();
        char c8 = sc.next().charAt(0);
        if(c8 == 'C') {
            punkty = punkty +1;
        }

        System.out.println("Koniec gry");
        System.out.println("Liczba uzyskanych punktów: " + punkty + " /10");

        try{
            File file = new File(filePath);

            if(!file.exists()) file.createNewFile();

        FileWriter fileWritter = new FileWriter(file,true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write("-----------------");
        bufferWritter.newLine();
        bufferWritter.write("Imie gracza: " + Imie);
        bufferWritter.newLine();
        bufferWritter.write("Uzyskane punkty : " + punkty + "/10");
        bufferWritter.newLine();
        bufferWritter.close();

    }catch(IOException e){
        e.printStackTrace();
    }
    }
}
