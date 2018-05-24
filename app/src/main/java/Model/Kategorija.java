package Model;

import java.util.ArrayList;

public class Kategorija {

    private int id;
    private String naziv;
    private ArrayList<Jelo> jela = new ArrayList<Jelo>();

    public Kategorija() {
    }

    public Kategorija(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void addJelo(Jelo jelo){
        jela.add(jelo);
    }

    public void removeJelo(Jelo jelo){
        jela.remove(jelo);
    }

    @Override
    public String toString() {
        return "Kategorija{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
