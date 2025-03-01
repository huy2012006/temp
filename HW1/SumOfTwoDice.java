public class SumOfTwoDice {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*6) + 1;
        int num2 = (int)(Math.random()*6) + 1;
        int sum = num1 + num2;
        System.out.printf("Tong hai so " + num1 + " va " + num2 + " la: " + sum);
    }
}
