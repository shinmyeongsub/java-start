package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하십쇼 : ");
        int i = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하십쇼 : ");
        int j = scanner.nextInt();

        int sum = i + j;
        System.out.println("sum = " + sum);

    }
}
