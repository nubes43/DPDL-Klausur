package reader.writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderWriter {

    public static void main(String[] args) {

        try {
            FileReader in = new FileReader("Input.txt");
            FileWriter out = new FileWriter("Output.txt");
            // BufferedReader bufferedReader = new BufferedReader(in);

            char[] ziel = new char[1024];
            int charsRead = in.read(ziel, 0, ziel.length);

            /*
             * Stream<String> text = bufferedReader.lines();
             * String result = text.filter(str -> str.length() >
             * 1).collect(Collectors.joining());
             */

            out.write(ziel);
            System.out.println(ziel);
            // bufferedReader.close();
            out.close();
        } catch (IOException e) {

            System.err.println("File missing");

        }

    }
}
