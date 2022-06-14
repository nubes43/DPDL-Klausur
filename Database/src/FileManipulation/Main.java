package FileManipulation;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {

        File neuerordner = new File("meinordner"); // Ordner erstellen
        neuerordner.mkdir();
        System.out.println("Ordner wurde erstellt:" + neuerordner.exists());

        File bla = new File("meinordner/datei.txt");
        try {
            bla.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println("Absoluter Pfad:" + bla.getAbsolutePath()); // Kompletten Pfas nach Windows von file bekommen
        System.out.println("Name:" + bla.getName()); // Namen von file bekommen
        System.out.println("Last Modified:" + bla.lastModified()); // Eigenschaft von File bekommen
        System.out.println("URI zu file:" + bla.toURI());

        File test = new File("test/test.txt"); // URI (Uniform Resource Identifier) von file bekommen
        URI uri = test.toURI();
        File uritest = new File(uri);
        System.out.println("Uri zu file exisitiert: " + uritest.exists());
        System.out.println("URI: " + uri);

        // Nur mit URI arbeiten um in andere Verzeichnisse zu kommen
        try {
            URI uri2 = new URI("file:/C:/test/test.txt");
            File urifile = new File(uri2);
            urifile.createNewFile();
            System.out.println("Uri zu test exisitiert: " + urifile.exists());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File bladir = new File("test"); // Inhalt eines Ordners auslesen
        for (String string : bladir.list()) {
            System.out.println(string);
        }

        File delfile = new File("test/delfile.txt"); // Datei löschen
        try {
            delfile.createNewFile();
            System.out.println("Datei gibt es vor dem löschen: " + delfile.exists());
            delfile.delete();
            System.out.println("Datei gibt es nach dem löschen noch: " + delfile.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
