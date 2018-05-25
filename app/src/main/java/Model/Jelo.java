package Model;


import java.util.ArrayList;
import java.util.List;

public class Jelo {

    private int id;
    private String slika;
    private String naziv;
    private String opis;
    private Kategorija kategorija;
    private Sastojak sastojak;
    private int kalorijska_vrednost;
    private double cena;
    private List<Sastojak> sastojci = new ArrayList<Sastojak>();

    public Jelo() {
    }

    public Jelo(int id, String slika, String naziv, String opis, Kategorija kategorija, Sastojak sastojak, int kalorijska_vrednost, double cena) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojak = sastojak;
        this.kalorijska_vrednost = kalorijska_vrednost;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public Sastojak getSastojak() {
        return sastojak;
    }

    public void setSastojak(Sastojak sastojak) {
        this.sastojak = sastojak;
    }

    public int getKalorijska_vrednost() {
        return kalorijska_vrednost;
    }

    public void setKalorijska_vrednost(int kalorijska_vrednost) {
        this.kalorijska_vrednost = kalorijska_vrednost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void addSastojak(Sastojak sastojak){
        sastojci.add(sastojak);
    }

    public void removeSastojak(Sastojak sastojak){
        sastojci.remove(sastojak);
    }



    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", slika='" + slika + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kategorija=" + kategorija +
                ", sastojak=" + sastojak +
                ", kalorijska_vrednost=" + kalorijska_vrednost +
                ", cena=" + cena +
                '}';
    }
}
