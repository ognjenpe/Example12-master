package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

public class SastojciProvider {


    public static List<String> getSastojci() {
        List<String> sastojci1 = new ArrayList<>();
        sastojci1.add("Mesano mleveno svinjsko i govedje meso");
        sastojci1.add("Crni luk");
        sastojci1.add("Somun");

        List<String> sastojci2 = new ArrayList<>();
        sastojci2.add("Rezanci");
        sastojci2.add("Sok od paradjza");


        List<String> sastojci = new ArrayList<>();
        sastojci.addAll(sastojci1);
        sastojci.addAll(sastojci2);
        return sastojci;
    }


}
