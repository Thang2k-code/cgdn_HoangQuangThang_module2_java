package ss5_accessModifier.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student student = new student();

        System.out.print("Nhập tên mới: ");
        String newName = sc.nextLine();

        System.out.print("Nhập lớp mới: ");
        String newClass = sc.nextLine();

        student.setName(newName);
        student.setClasses(newClass);

        System.out.println("Thông tin sinh viên sau khi cập nhật:");
        System.out.println(student.getInfo());

        sc.close();
    }
}