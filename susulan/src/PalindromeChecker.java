import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan kata atau kalimat: ");
        String userInput = scanner.nextLine();

        // Menentukan apakah input adalah palindrome atau tidak
        if (isPalindrome(userInput)) {
            System.out.println("Input adalah palindrome.");
        } else {
            System.out.println("Input bukan palindrome.");
        }
    }

    // Method untuk menentukan apakah string adalah palindrome
    private static boolean isPalindrome(String inputStr) {
        // Menghapus spasi, huruf kapital/kecil, dan tanda baca dari input
        String cleanedStr = inputStr.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Mengecek apakah string bersih adalah palindrome
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }
}
