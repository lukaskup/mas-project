import java.util.ArrayList;
import java.util.List;

public class Country {
    private static List<Country> extent;
    private String name;

    static{
        extent = Extensions.load("FileExtension.txt");
        if(extent == null){
            extent = new ArrayList<>();
        }
    }

    public static void writeExtent(){
        Extensions.save(Country.extent, "FileExtension.txt");
    }

    public Country(String name) {
        this.name = name;
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
