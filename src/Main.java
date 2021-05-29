import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean breakFlag = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!breakFlag){

            int option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println("1 - Stwórz pracownika");
                    Country newCountry = new Country("Poland");
                    Address newAddress = new Address("siedlecka", "23", "08-110", "Siedlce", newCountry);
                    List<Blog> newBlogs = List.of(new Blog("lukanio blog", "lukanio.blog.pl"), new Blog("lukanio blog 2", "lukanio2.blog.pl"));
                    new User("łukanio", "skup", "123412123", "lukanio@gmail.com", newAddress, newBlogs);
                    break;
                case 2:
                    System.out.println("2 - Zapisz pracownika");
                    User.writeExtent();
                default:
                    breakFlag = true;
                    break;
            }
        }
	// write your code here
    }
}
