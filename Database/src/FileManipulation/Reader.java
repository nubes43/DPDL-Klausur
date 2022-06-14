package FileManipulation;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Reader {

    public static void main(String[] args) {

        File test = new File("test/test.txt");
        try {
            Scanner scan = new Scanner(test);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> lines;
        try {
            lines = Files.readAllLines(FileSystems.getDefault().getPath("test/test.txt"), StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}