import java.security.SecureRandom;
import java.util.Scanner;
		public class PasswordGenerator {

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		        String lower = "abcdefghijklmnopqrstuvwxyz";
		        String numbers = "0123456789";
		        String symbols = "!@#$%^&*()-_=+<>?";

		        String allCharacters = upper + lower + numbers + symbols;

		        SecureRandom random = new SecureRandom();

		        System.out.println("--- Password Generator ---");
		        System.out.print("Enter password length: ");

		        int length = scanner.nextInt();

		        StringBuilder password = new StringBuilder();

		        for (int i = 0; i < length; i++) {
		            int index = random.nextInt(allCharacters.length());
		            password.append(allCharacters.charAt(index));
		        }

		        System.out.println("Your Password has been randomly generated:");
		        System.out.println(password);

		        scanner.close();
		    }
	
	}


