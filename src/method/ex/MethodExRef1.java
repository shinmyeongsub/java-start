package method.ex;

public class MethodExRef1 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;

//        int sum = a + b + c;
//        double average = makeAverage(a,b,c);
        System.out.println("average = " + makeAverage(1,2,3));

//        int x = 15;
//        int y = 25;
//        int z = 35;

//        sum = x + y + z;
//        average = makeAverage(x,y,z);
        System.out.println("average = " + makeAverage(15,25,35));
    }

    public static double makeAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        return average;
    }
}
