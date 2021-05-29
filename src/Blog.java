import java.util.ArrayList;
import java.util.List;

public class Blog {
    private static List<Blog> extent = new ArrayList<>();
    private String name;
    private String url;

    static{
        extent = Extensions.load("FileExtension.txt");
        if(extent == null){
            extent = new ArrayList<>();
        }
    }

    public static void writeExtent(){
        Extensions.save(Blog.extent, "FileExtension.txt");
    }

    public Blog(String name, String url) {
        this.name = name;
        this.url = url;
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
