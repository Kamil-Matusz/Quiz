package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Wyniki {
    public static void Wyświetl_wyniki() {
        try {
            File file = new File("D:\\Back-End\\Java\\Kółko Naukowe\\Quiz\\Wyniki\\Wyniki.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
