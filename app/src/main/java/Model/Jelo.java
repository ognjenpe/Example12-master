package Model;

public class Jelo {

    private int id;
    private String slika;
    private String naziv;
    private String opis;
    private String kategorija;
    private String sastojak;
    private int kalorijska_vrednost;
    private double cena;

    public Jelo() {
    }

    public Jelo(int id, String slika, String naziv, String opis, String kategorija, String sastojak, int kalorijska_vrednost, double cena) {
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

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getSastojak() {
        return sastojak;
    }

    public void setSastojak(String sastojak) {
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

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", slika='" + slika + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", sastojak='" + sastojak + '\'' +
                ", kalorijska_vrednost=" + kalorijska_vrednost +
                ", cena=" + cena +
                '}';
    }
}
