import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Article {
    private static List<Article> extent = new ArrayList<>();
    private String title;
    private String content;
    private String status;
    private int qualityRate; // optional
    private String adminComment; // optional

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
        this.status = "new";
        extent.add(this);
    }

    public Article(String title, String content, String status, int qualityRate, String adminComment) {
        this.title = title;
        this.content = content;
        this.status = status;
        this.qualityRate = qualityRate;
        this.adminComment = adminComment;
        extent.add(this);
    }

    static{
        extent = Extensions.load("FileExtension.txt");
        if(extent == null){
            extent = new ArrayList<>();
        }
    }

    public static void writeExtent(){
        Extensions.save(Article.extent, "FileExtension.txt");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    //ograniczenie własne
    public void setContent(String content) throws Exception {
        checkBadWords(content);
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQualityRate() {
        return qualityRate;
    }

    public void setQualityRate(int qualityRate) {
        this.qualityRate = qualityRate;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    private List<String> badWords = Arrays.asList("kurcze", "kurde", "psia mać", "kurczaczki", "baba");

    private void checkBadWords(String content) throws Exception{
        for(String badWord : badWords) {
            if(content.contains(badWord)){
                throw new Exception(String.format("Article content have bad word in it (%s), please remove them to submit article", badWord));
            }
        }
    }
}
