package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++){
            System.out.print(i);
            if (i != b){
                System.out.print(",");
            }
        }
    }
}
