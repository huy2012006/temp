import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double rad = Math.toRadians(x);
        double sum = Math.sin(2*rad) + Math.sin(3*rad);
        System.out.printf("Tong cua sin(2x) + sin(3x) voi x = " + x + " do la: " + sum);
    }
}
