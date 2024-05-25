package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("가격 : ");
            int price = scanner.nextInt();

            if (price == -1){
                break;
            }

            System.out.print("수량 : ");
            int amount = scanner.nextInt();

            System.out.println("총 가격 : " + (price * amount));

        }
    }
}
