package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Jelo;
import rs.aleph.android.example12.activities.model.Kategorija;

public class JeloProvider {
    public static List<Jelo> getJelo() {

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija corbe = new Kategorija(1, "Corbe");
        Kategorija kuvano = new Kategorija(2, "Kuvana Jela");

        Jelo cevapi = new Jelo(0, "cevapi.jpg", "Cevapi", "10 cevapa u pola somuna sa lukom", rostilj, null, 1500, 750);
        /*List<Sastojak> sastojci1 = new ArrayList<Sastojak>();
        Sastojak s1 = new Sastojak(0, "Junece meso",cevapi );
        sastojci1.add(s1);
        Sastojak s2 = new Sastojak(1, "Crni luk",cevapi );
        sastojci1.add(s2);
        Sastojak s3 = new Sastojak(2, "Domaci somun",cevapi );
        sastojci1.add(s3);
        cevapi.setSastojci(sastojci1);*/

        Jelo crvena_supa = new Jelo(1, "crvena_supa.jpeg", "Supa od paradjza", "Crvena supa od paradjza", corbe, null, 500, 500 );
        /*List<Sastojak> sastojci2 = new ArrayList<Sastojak>();
        Sastojak s4 = new Sastojak(0, "Svinjsko meso",karadjordjeva );
        sastojci2.add(s4);
        Sastojak s5 = new Sastojak(1, "Kackavalj",karadjordjeva );
        sastojci2.add(s5);
        Sastojak s6 = new Sastojak(2, "Pomfrit",karadjordjeva );
        sastojci2.add(s6);
        cevapi.setSastojci(sastojci2);*/

        Jelo pasulj = new Jelo(2, "pasulj.jpeg", "Pasulj", "Corbast pasulja sa slaninom", kuvano, null, 900, 400 );
        /*List<Sastojak> sastojci3 = new ArrayList<Sastojak>();
        Sastojak s7 = new Sastojak(0, "Testo",pizza1 );
        sastojci3.add(s7);
        Sastojak s8 = new Sastojak(1, "Sir",pizza1 );
        sastojci3.add(s8);
        Sastojak s9 = new Sastojak(2, "Pelat",pizza1 );
        sastojci3.add(s9);
        pizza1.setSastojci(sastojci3);*/


        List<Jelo> jela = new ArrayList<>();
        jela.add(cevapi);
        jela.add(crvena_supa);
        jela.add(pasulj);
        return jela;
    }


    public static List<String> getJeloImena() {

        List<String> names = new ArrayList<>();
        names.add("Cevapi");
        names.add("Crvena Supa");
        names.add("Pasulj");
        return names;
    }


    public static Jelo getJeloById(int id) {

        Kategorija rostilj = new Kategorija(0, "Rostilj");
        Kategorija corbe = new Kategorija(1, "Corbe");
        Kategorija kuvano = new Kategorija(2, "Kuvano Jela");

        switch (id) {
            case 0:
                return new Jelo(0, "cevapi.jpg", "Cevapi", "10 cevapa u pola somuna sa lukom", rostilj, "Sastojci: Mesano mleveno svinjsko i govedje meso, somun, luk.", 1500, 750);
            case 1:
                return new Jelo(1, "crvena_supa.jpg", "Supa od paradjza", "Crvena supa od paradjza", corbe, "Sastojci: rezanci, sok od paradjza", 500, 500 );
            case 2:
                return new Jelo(2, "pasulj.jpg", "Pasulj", "Corbast pasulja sa slaninom", kuvano, "Sastojci: Kineski pasulj, barena slanina, luk.", 900, 400 );
            default:
                return null;
        }
    }
}
