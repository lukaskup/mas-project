import java.util.Scanner;

public class Main {

    public static boolean breakFlag = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(!breakFlag){
            System.out.println("1 - Stwórz pracownika");

            int option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println("pracownik jest tworzony");
                default:
                    breakFlag = true;
                    break;
            }
        }
	// write your code here
    }
}
