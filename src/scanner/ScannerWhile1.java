package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("문자열 입력 : ");
            String str = scanner.nextLine();
            if(str.equals("EXIT")) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
