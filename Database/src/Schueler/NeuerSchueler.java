package Schueler;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="student")

public class NeuerSchueler {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name="nummer")
    private int nummer;

    @Column(name="name")
    private String name;

    @Column(name="jahrgang")
    private int jahrgang;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

}