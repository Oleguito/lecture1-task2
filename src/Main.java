import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        /* int потянет 10 в 9 степени */
        int first = s.nextInt();
        System.out.println("Введите второе число: ");
        int second = s.nextInt();

        if (first>second) System.out.println('>');
        else if (first<second) System.out.println('<');
        else System.out.println('=');
    }
}