import java.util.ArrayList;
import java.util.Scanner;

public class StringToIntegerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        while (true) {
            System.out.print("Nhap chuoi (go 'exit' de ket thuc): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                validNumbers.add(number);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("So chuoi hop le: " + validNumbers.size());
        System.out.println("So chuoi khong hop le: " + invalidCount);
        System.out.println("Danh sach so nguyen hop le: " + validNumbers);
    }
}
