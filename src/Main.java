import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//W pliku README.md znajduje się opis i wskazanie implementacji poszczególnych podpunktów mp4
public class Main {

    public static boolean breakFlag = false;

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        while(!breakFlag){

            int option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println("ograniczenie atrybutu");
                    //ograniczenie atrybutu

                    //will throw exception
                    Blog blog = new Blog("test", "www.blogName.com");
                    blog.setName("blogNameWithOverThirtyTwoCharacters");
                    break;
                case 2:
                    //ograniczenie unique

                    Country poland = new Country("poland");
                    Address address = new Address("belgradzka", "2", "08-110", "warsaw", poland);
                    List<Blog> blogs = new ArrayList<Blog>();

                    //will throw exception
                    new User("Lukasz", "Skup", "123123123", "lukasz@email.com", address, blogs);
                    User mateusz = new User("Mateusz", "Pietrzak", "345345345", "lukasz@email.com", address, blogs);
                    mateusz.setPhoneNumber("123123123");
                    break;
                case 3:
                    //ograniczenie własne

                    //will throw exception
                    Article article = new Article("tytuł", "jakas przykladowa tresc artykułu");
                    article.setContent("jakies brzydkie słowo na przykład kurde");
                default:
                    breakFlag = true;
                    break;
            }
        }
	// write your code here
    }
}
