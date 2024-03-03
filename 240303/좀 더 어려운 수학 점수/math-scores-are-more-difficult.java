import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //A 수학
        int b = sc.nextInt(); //A 영어
        int c = sc.nextInt(); //B 수학
        int d = sc.nextInt(); //B 영어

        if (a > c) {
            System.out.println("A");
        } else if (a < c) {
            System.out.println("B");
        } else if (a == c) {
            if (b > d) {
            System.out.println("A");
            } else if (b < d) {
            System.out.println("B");
            }
        }
    }
}