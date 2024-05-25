package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int age = scanner.nextInt();

        if ((age % 2) == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
