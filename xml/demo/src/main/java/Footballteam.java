import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Footballteam {
    int id;
    String name;
    int gruendungsjahr;

    public int getGruendungsjahr() {
        return gruendungsjahr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
    public int setGruendungsjahr(int gruendungsjahr) {
        return this.gruendungsjahr = gruendungsjahr;
    }

    public int setId(int id) {
        return this.id = id;
    }

}
