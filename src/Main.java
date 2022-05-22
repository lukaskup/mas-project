import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//W pliku README.md znajduje się opis i wskazanie implementacji poszczególnych podpunktów mp4
public class Main {

    public static boolean breakFlag = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!breakFlag){

            int option = in.nextInt();
            switch (option){
                case 1:
                    //ograniczenie atrybutu

                    //will throw exception
                    new Blog("blogNameWithOverThirtyTwoCharacters", "www.blogName.com");

                    //correct
                    //new Blog("blogNameWithOverThirtyTwoCharacters", "www.blogName.com");
                    Blog.writeExtent();
                    break;
                case 2:
                    //ograniczenie unique

                    Country poland = new Country("poland");
                    Address address = new Address("belgradzka", "2", "08-110", "warsaw", poland);
                    List<Blog> blogs = new ArrayList<Blog>();

                    //will throw exception
                    new User("Lukasz", "Skup", "123123123", "lukasz@email.com", address, blogs);
                    new User("Mateusz", "Pietrzak", "123123123", "lukasz@email.com", address, blogs);

                    //correct
                    //new User("Lukasz", "Skup", "123123123", "lukasz@email.com", address, blogs);
                    //new User("Mateusz", "Pietrzak", "345345345", "lukasz@email.com", address, blogs);

                    Blog.writeExtent();
                    Address.writeExtent();
                    User.writeExtent();
                    break;
                case 3:
                    //ograniczenie własne

                    //will throw exception
                    new Article("tytuł", "jakas przykladowa tresc artykułu");

                    //correct
                    //new Article("tytuł", "tutaj mamy brzydkie slowo kurcze");

                    Article.writeExtent();
                default:
                    breakFlag = true;
                    break;
            }
        }
	// write your code here
    }
}
