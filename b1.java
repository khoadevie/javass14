import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap mot so nguyen: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("So nhap vao khong hop le de kiem tra so nguyen to.");
                return;
            }

            boolean isPrime = true;

            if (n == 1) isPrime = false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(n + " la so nguyen to.");
            } else {
                System.out.println(n + " khong phai la so nguyen to.");
            }
        } catch (Exception e) {
            System.out.println("Gia tri nhap vao khong phai la so nguyen.");
        }
    }
}
