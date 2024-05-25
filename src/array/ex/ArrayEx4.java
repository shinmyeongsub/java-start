package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개 입력 받으십쇼");

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
