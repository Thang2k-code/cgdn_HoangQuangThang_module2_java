package ss3_Arrayy_Method;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[50];
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;
        int soluongphantu = 4;
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < soluongphantu; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập phần tử cần thêm: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = sc.nextInt();
        if (index < 0 || index > soluongphantu) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int i = soluongphantu; i > index; i--) {
                num[i] = num[i - 1];
            }
            num[index] = x;
            soluongphantu++;

            // Bước 6: In mảng sau khi chèn
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < soluongphantu; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }
}
