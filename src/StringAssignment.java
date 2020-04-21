import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}
