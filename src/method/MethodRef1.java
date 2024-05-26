package method;

public class MethodRef1 {
    public static void main(String[] args) {
        // 계산1
        int a = 15;
        int b = 25;

        int sum1 = add(a,b); // Ctrl + b
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("==============================");

        // 계산2
        int x = 111;
        int y = 222;
        int sum2 = add(x,y);
        System.out.println("결과2 출력 : " + sum2);
    }

    // add 메서드
    public static int add (int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a+b;
        return sum;
    }
}
