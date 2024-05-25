package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("a = " + a);

        int b = scanner.nextInt();
        System.out.println("b = " + b);

        System.out.println();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
