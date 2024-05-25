package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("이름 : ");
            String name = scanner.nextLine();

            if (name.equals("종료")){
                break;
            }
            System.out.print("나이 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("name = " + name);
            System.out.println("age = " + age);

        }
    }
}
