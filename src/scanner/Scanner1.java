package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hello\n");
        System.out.println("world\n");

        System.out.print("문자열을 입력하세요. : ");
        String str = scanner.nextLine(); // 입력을 String 형태로 가져온다.
        System.out.println("str = " + str);

        System.out.print("정수를 입력하세요. : ");
        int i = scanner.nextInt(); // 입력을 int 형태로 가져온다.
        System.out.println("i = " + i);

        System.out.print("실수를 입력하세요. : ");
        double d = scanner.nextDouble(); // 입력을 double 형태로 가져온다.
        System.out.println("d = " + d);
    }
}
