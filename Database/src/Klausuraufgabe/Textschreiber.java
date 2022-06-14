package Klausuraufgabe;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class Textschreiber {

    public static void main(String[] args) throws IOException {

        InputStreamReader InStR = new InputStreamReader(System.in);
        BufferedReader BuR = new BufferedReader(InStR);

        System.out.println("Dateipfad angeben: ");
        String path = BuR.readLine();

        System.out.println("Zeilenanzahl angeben: ");
        int lineNr = Integer.parseInt(BuR.readLine());

        FileOutputStream FOS = new FileOutputStream(path);
        String line = "";

        for (int i = 0; i < lineNr; i++) {
            System.out.println("Zeile " + (i + 1) + " eingeben:");
            line = BuR.readLine() + '\n';

            byte[] output = line.getBytes();

            for (byte b : output) {
                FOS.write(b);
            }
        }
        FOS.close();
        BuR.close();
        InStR.close();
    }
}