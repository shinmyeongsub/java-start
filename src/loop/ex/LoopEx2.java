package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
//        int num = 0;
        int count = 1;

        while(count <= 10){
            System.out.println("num : " + (count*2));
            count++;
        }

        for (int num = 2, count2 = 1; count2 <= 10; num += 2, count2 ++) {
            System.out.println(num);
        }
    }
}
