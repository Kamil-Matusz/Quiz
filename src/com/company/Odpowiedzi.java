package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Odpowiedzi {
    public static void Wyświetl_odpowiedzi() {
        try {
            File file = new File("D:\\Back-End\\Java\\Kółko Naukowe\\Quiz\\Odpowiedzi\\Odpowiedzi.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
