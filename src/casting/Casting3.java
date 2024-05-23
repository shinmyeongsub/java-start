package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntVal = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // integer number too large (Int 최고값 + 1)
        int intValue = 0;

        intValue = (int) maxIntVal; // 형변환
        System.out.println("maxIntValue casting = " + intValue);


        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue);
    }
}
