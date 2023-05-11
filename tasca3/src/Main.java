import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        if (Password.passwordValidator(sc.nextLine()) == true) {
            System.out.println("oki");
        }
    }
}