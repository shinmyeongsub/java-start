package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        for(int number : numbers) {
            System.out.println(number);
        }

        // for-each 문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for(int i=0; i<numbers.length; i++){
            System.out.println("number" + i + "번의 결과는 " + numbers[i]);
        }
    }
}
