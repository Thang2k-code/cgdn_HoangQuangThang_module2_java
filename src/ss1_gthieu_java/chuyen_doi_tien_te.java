package ss1_gthieu_java;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn đổi: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Gía trị sau khi quy đổi là: " + quydoi);
    }
}
