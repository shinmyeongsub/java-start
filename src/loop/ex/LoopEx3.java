package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;

        while (i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);

        max = 100;
        sum = 0;

        for (i = 1; i<= max; i ++){
            sum += i;
        }
        System.out.println(sum);
    }
}
