package ss1_gthieu_java;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Nhận dữ liệu người dùng
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Nhận dữ liệu là một chuỗi
        System.out.println("Hello" + name);
    }
}
