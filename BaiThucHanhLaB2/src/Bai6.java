import java.util.Scanner;

public class Bai6 { public static void main(String[] args) {
    int number, temp = 1;
    long giaiThua = 1;
     
    try (Scanner sc = new Scanner(System.in)) {
        do {
            System.out.println("nhap vao 1 so bat ky: ");
            number = sc.nextInt();
        } while ((number <= 0) || (number > 10));
    }
     
    while (temp <= number) {
        giaiThua *= temp;
        temp++;
    }
     
    System.out.println(number + "! = " + giaiThua);
}
    
}
