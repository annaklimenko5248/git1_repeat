import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scn.nextInt();
        System.out.println("Enter b:");
        int b = scn.nextInt();
        System.out.println("1. sum\n 2. minus\n");
        int input = scn.nextInt();
        switch (input) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
        }
        System.out.println("Good bue");
    }
}
