package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleVal = 1.5;
        int intVal = 0;

//        intVal = doubleVal; // 컴파일 오류 발생
        intVal = (int) doubleVal; // 명시적 형변환
        System.out.println(intVal); // 손실 발생 가능성 있다.

        System.out.println(doubleVal);
        System.out.println((int) 10.5);
    }
}
