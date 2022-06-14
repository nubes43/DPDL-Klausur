package Schueler;


import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {

    public static void main(String[] args) {
        /*




        Configuration configuration = new Configuration();
        configuration.configure("hiber_mysql");
        configuration.addAnnotatedClass(NeuerSchueler.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession(); */

  
        NeuerSchueler student = new NeuerSchueler();
        student.setName("Klaus Peter");
        student.setJahrgang(21);
        student.setNummer(13);
        
        NeuerSchueler student2 = new NeuerSchueler();
        student2.setName("Hans Peter");
        student2.setJahrgang(22);
        student2.setNummer(1);
        
        ArrayList <NeuerSchueler> Schuelerlist = new ArrayList <NeuerSchueler> ();
        Schuelerlist.add(student);
        Schuelerlist.add(student2);
        
        SchuelerListe listnew = new SchuelerListe();
        listnew.setList(Schuelerlist);
        
        converttoxml(listnew);

/*
        session.beginTransaction();

        session.save(student);

        session.getTransaction().commit();


*/
    }

    private static void converttoxml(SchuelerListe schueler) {
    	try {
			JAXBContext context = JAXBContext.newInstance(NeuerSchueler.class);
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sr = new StringWriter();
			mar.marshal(schueler, sr);
			String string = sr.toString();
			System.out.println(string);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
