package ss3_Arrayy_Method;
import java.util.Scanner;

public class tim_phan_tu_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Tìm giá trị nhỏ nhất và tọa độ
        double min = matrix[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Giá trị nhỏ nhất là: " + min + " tại vị trí [" + minRow + "][" + minCol + "]");

        sc.close();
    }
}
