import java.util.*;

public class DataStructure {

    public static void main(String[] args) {

        List<Object> l = new ArrayList<Object>();
        // List<String> l = new ArrayList<String>();
        // List l = new ArrayList();

        l.add("This is a String");
        l.add(new Short((short) 12));
        l.add(new Integer(35));

        for (Iterator<Object> i = l.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}