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

    //ograniczenie atrybutu
    public void setName(String name) throws Exception {
        if(name.length() == 0){
            throw new Exception("Blog name can't be empty");
        } else if(name.length() > maxBlogNameLength){
            throw new Exception(String.format("Blog name can't be longer than %s characters", maxBlogNameLength));
        }

        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private int maxBlogNameLength = 32;
}
