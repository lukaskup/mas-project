import java.util.ArrayList;
import java.util.List;

public class Country {
    private static List<Country> extent = new ArrayList<>();
    private String name;

    public Country() {
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
