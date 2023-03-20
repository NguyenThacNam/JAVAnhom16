import java.util.Scanner;

public class Bai8 {public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap luong so nguyen:");
        int n = sc.nextInt();

        int sum = 0 ;
        int i ;
        for (i = 0; i < n ; i++) {
            System.out.println("Nhap so nguyen tiep theo:");
            int num = sc.nextInt();
            sum += num; 
        }

        double tbc = (double) sum / n;
        System.out.println("Trung binh cong cua" + n + "so nguyen la" + tbc);
        sc.close();
    }
}
    
}
