import java.util.*;

class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }
}

class PhoneValidator {
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Chua ky tu khong hop le");
        }
        if (!phone.startsWith("0")) {
            throw new InvalidPhoneNumberLengthException("Khong bat dau bang 0");
        }
        for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidPhoneNumberLengthException("Chua ky tu khong hop le");
            }
        }
    }
}

public class PhoneValidationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validPhones = new ArrayList<>();
        List<String> invalidPhones = new ArrayList<>();

        System.out.println("Nhap danh sach so dien thoai (go 'exit' de ket thuc):");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                PhoneValidator.validatePhoneNumber(input);
                validPhones.add(input);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhones.add(input + " - " + e.getMessage());
            }
        }

        System.out.println();
        System.out.println("So dien thoai hop le:");
        for (String phone : validPhones) {
            System.out.println(phone);
        }

        System.out.println();
        System.out.println("So dien thoai khong hop le:");
        for (String phone : invalidPhones) {
            System.out.println(phone);
        }
    }
}
