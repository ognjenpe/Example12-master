package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Kategorija;

public class KategorijaProvider {
    public static List<Kategorija> getCategories() {

        List<Kategorija> categories = new ArrayList<>();
        categories.add(new Kategorija(0, "Rostilj"));
        categories.add(new Kategorija(1, "Corbe"));
        categories.add(new Kategorija(2, "Kuvana Jela"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Rostilj");
        names.add("Corbe");
        names.add("Kuvana Jela");
        return names;
    }

    public static Kategorija getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Kategorija(0, "Rostilj");
            case 1:
                return new Kategorija(1, "Corbe");
            case 2:
                return new Kategorija(2, "Kuvana Jela");
            default:
                return null;
        }
    }
}
