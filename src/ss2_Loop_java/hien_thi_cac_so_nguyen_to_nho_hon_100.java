package ss2_Loop_java;
public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        System.out.print("Số lượng số nguyên tố nhỏ hơn 100: ");
        for(int i=2;i<100;i++){
            if (laSoNguyenTo(i)) {
                System.out.println( i + " ");
            }
        }
    }
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    }
