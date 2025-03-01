public class Introduction {
    public static void main(String[] args) {
        System.out.println("Họ Tên\tMã Sinh Viên\tLớp\tGitHub Username\tEmail");
        System.out.println("Doanh Quang Huy\t24022354\tOOP 1\thuy2012006\t24022354@vnu.edu.vn");
        for (int i = 9; i >= 0; i--) {
            if (i > 0) {
                System.out.println(i + (i > 1 ? " bottles" : " bottle") + " of beer on the wall, " + i + " " +
                        (i > 1 ? "bottles" : "bottle") + " of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
