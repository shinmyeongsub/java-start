package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자 개수 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNum, maxNum;

        System.out.println(n + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i ++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = numbers[0];
        maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        System.out.println("min : " + minNum);
        System.out.println("max : " + maxNum);

    }
}
