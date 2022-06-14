package Klausuraufgaben;

import java.io.*;

public class CharStream {

    public static void main(String[] args) throws IOException {

        try {

            File input = new File("input.html");
            FileReader FR = new FileReader(input);

            File output = new File("output.html");
            FileWriter FW = new FileWriter(output);

            BufferedReader BR = new BufferedReader(FR);
            PrintWriter PW = new PrintWriter(FW);

            String content = "";
            while (BR.read() != -1) {

                content = BR.readLine();
                content = content.replaceAll("ä", "&auml;");
                content = content.replaceAll("Ä", "&Auml;");
                content = content.replaceAll("ö", "&ouml;");
                content = content.replaceAll("Ö", "&Ouml;");
                content = content.replaceAll("ü", "&uuml;");
                content = content.replaceAll("Ü", "&Uuml;");
                content = content.replaceAll("ß", "&szlig;");
                content = content.replaceAll("\"", "&quot;");
                PW.println(content);
            }

            BR.close();
            PW.close();
            FR.close();
            FW.close();

        } catch (IOException e) {
            System.err.println("Datei fehlt!");
            e.printStackTrace();

        } finally {

        }

    }

}