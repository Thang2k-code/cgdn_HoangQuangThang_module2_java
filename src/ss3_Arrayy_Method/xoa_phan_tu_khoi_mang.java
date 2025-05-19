package ss3_Arrayy_Method;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {2, 4, 6, 8, 10, 12, 14, 16};
        int soluongphantu = 8;
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < soluongphantu; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập phần tử cần xóa: ");
        int del = sc.nextInt();

        int indexDel = -1;
        for (int i = 0; i < soluongphantu; i++) {
            if (num[i] == del) {
                indexDel = i;
                break;
            }
        }
        if (indexDel == -1) {
            System.out.println("Không tìm thấy phần tử " + del + "trong mang");
        } else {
            for (int i = indexDel; i < soluongphantu - 1; i++) {
                num[i] = num[i + 1];
            }
            soluongphantu--;

            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < soluongphantu; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }
}
