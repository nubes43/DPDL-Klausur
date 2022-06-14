
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws IOException {
        File ordner = new File("bla/suelz/testdir");

        String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());

        System.out.println(timeStamp);

        ordner.mkdirs();

        if (ordner.isDirectory()) {
            System.out.println("Ordner ist da");

            File unsereDatei = new File("bla/suelz/testdir/unsereDatei.txt");

            try {
                unsereDatei.createNewFile();
                // File neuerName = new File("bla/suelz/testdir/neuerName.txt");
                // unsereDatei.renameTo(neuerName);
                FileWriter Writer = new FileWriter(unsereDatei);
                Writer.write(timeStamp);
                Writer.close();

            } catch (IOException e) {
                System.out.println("Fehler: Datei nicht angelegt.");
                // e.printStackTrace();
            }
        } else {
            System.out.println("Oberordner ist nicht da.");
        }

    }
}