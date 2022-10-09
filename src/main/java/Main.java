import java.util.Scanner;

public class Main {
    public static String xu_ly_vi_pham(int loi, int dem) {
        if ((loi < 1 || loi > 9) || (dem < 1)) {
            return "Invalid input";
        }
        if (loi < 7 && dem < 6) {
            return "Phạt tiền";
        }
        if (loi < 7) {
            return "Phạt tiền và treo bằng 6 tháng";
        }
        if (dem < 6) {
            return "Phạt tiền và treo bằng 3 năm";
        }
        return "Phạt tiền và treo bằng vĩnh viễn";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập id lỗi vi phạm:");
        int loi = sc.nextInt();
        System.out.println("Mời bạn nhập số lần vi phạm:");
        int dem = sc.nextInt();
        System.out.println(xu_ly_vi_pham(loi, dem));
    }
}
