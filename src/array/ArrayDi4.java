package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 X 3 2차원 배열을 만든다.
        int[][] arr = new int[9][9];

        int i = 1;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
