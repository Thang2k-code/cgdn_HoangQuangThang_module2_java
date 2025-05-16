package ss2_Loop_java;

import java.util.Scanner;

public class hien_thi_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.println("Các số nguyên tố đầu tiên là:");
        while (count < numbers) {
            if (laSoNguyenTo(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        sc.close();
    }
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
