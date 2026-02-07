import java.util.Scanner;

public class BankWithdrawApp {
    public static void main(String[] args) {
        final long balance = 1_000_000;
        final long minBalance = 50_000;
        long currentBalance = balance;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien muon rut: ");

        try {
            long withdrawAmount = scanner.nextLong();

            if (withdrawAmount <= 0) {
                System.out.println("Loi: So tien rut phai lon hon 0!");
            } else if (withdrawAmount > currentBalance) {
                System.out.println("Loi: So tien rut vuot qua so du!");
            } else if (currentBalance - withdrawAmount < minBalance) {
                System.out.println("Loi: Tai khoan phai duy tri so du toi thieu 50.000 dong!");
            } else {
                currentBalance -= withdrawAmount;
                System.out.println("Rut tien thanh cong!");
                System.out.println("So tien da rut: " + withdrawAmount + " dong");
                System.out.println("So du con lai: " + currentBalance + " dong");
            }
        } catch (Exception e) {
            System.out.println("Loi: Vui long nhap mot so hop le!");
        }
    }
}
