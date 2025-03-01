public class RollLoadedDie {
    public static void main(String[] args) {
        double x = Math.random();
        int roll;
        if(x < 3.0/8.0) roll = 6;
        else if (x < 4.0/8.0) roll = 5;
        else if (x < 5.0/8.0) roll = 4;
        else if (x < 6.0/8.0) roll = 3;
        else if (x < 7.0/8.0) roll = 2;
        else roll = 1;
        System.out.println(roll);
    }
}
