package FileManipulation;

import java.io.*;

public class Writer {

    public static void main(String[] args) {
        File datei = new File("meinordner/datei.txt");
        try {
            FileWriter fw = new FileWriter(datei);
            fw.write("Ob das schreibt wissen wir gleich1234jhg");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}