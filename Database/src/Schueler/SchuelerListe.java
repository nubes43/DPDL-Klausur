package Schueler;


import java.util.ArrayList;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SchuelerListe {

	public ArrayList<NeuerSchueler> getList() {
		return list;
	}

	public void setList(ArrayList<NeuerSchueler> list) {
		this.list = list;
	}

	@XmlElementWrapper(name = "SchuelerListe")
	@XmlElement(name = "NeuerSchueler")
	private ArrayList <NeuerSchueler> list;
	
	
	
}
