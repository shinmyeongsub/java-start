package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자 개수 : ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println(count + "개 입력 받으십쇼");

        for (int i = 0;  i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double)sum/numbers.length);
    }
}
