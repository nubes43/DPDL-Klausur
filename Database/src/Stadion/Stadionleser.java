package Stadion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stadionleser {

    public static void main(String[] args) throws IOException {
        String line = "";
        String line1 = "";

        FileReader file = new FileReader("Stadion.txt");
        FileReader file1 = new FileReader("Stadion.txt");
        BufferedReader reader = new BufferedReader(file);
        BufferedReader reader1 = new BufferedReader(file1);
        int counter = 0;
        double gesamt = 0;
        while ((line = reader.readLine()) != null) {

            if (counter > 0) {
                String[] sep = line.split(";");
                // System.out.println(sep[6].trim());

                gesamt += Double.parseDouble(sep[6].trim());

            }
            counter++;
        }

        double schnitt = gesamt / counter;

        System.out.println(schnitt);
        reader.close();

        counter = 0;
        gesamt = 0;
        while ((line = reader1.readLine()) != null) {

            if (counter > 0) {
                String[] sep = line.split(";");
                // System.out.println(sep[11].trim());

                gesamt += Double.parseDouble(sep[11].trim());

            }
            counter++;
        }

        schnitt = gesamt / counter;

        System.out.println(schnitt);
        reader1.close();
    }
}