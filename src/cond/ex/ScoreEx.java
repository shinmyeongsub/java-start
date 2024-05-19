package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 90) {
            System.out.println("학점은 A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B학점 입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C학점 입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D학점 입니다.");
        } else {
            System.out.println("학점은 F학점 입니다.");
        }
    }
}
