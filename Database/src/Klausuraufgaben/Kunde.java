package Klausuraufgaben;

public class Kunde {

    private String name;
    private String adresse;

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public void Kunde() {

    }

    public void Kunde(Kunde other) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}