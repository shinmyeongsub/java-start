package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식 입력 : ");
        String name = input.nextLine();

        System.out.print("가격 입력 : ");
        int price = input.nextInt();

        System.out.print("수량 입력 : ");
        int amount = input.nextInt();

        int totalPrice = price * amount;
        System.out.print("음식 이름 : " + name + ", 총 가격 : " + totalPrice);
    }
}
