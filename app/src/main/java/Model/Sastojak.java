package Model;

public class Sastojak {

    private int id;
    private String naziv;


    public Sastojak() {
    }

    public Sastojak(int id, String naziv) {
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

    @Override
    public String toString() {
        return "Sastojak{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
