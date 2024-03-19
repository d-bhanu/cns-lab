import java.util.Scanner;

public class CaesarCipherProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input text from the user
        System.out.print("Enter the text to encrypt: ");
        String plainText = scanner.nextLine();

        // Get the secret key
        System.out.print("Enter the secret key: ");
        int key = scanner.nextInt();

        // Encrypt using Caesar Cipher
        String caesarCipherText = caesarCipherEncrypt(plainText, key);
        System.out.println("Caesar Cipher Encrypted Text: " + caesarCipherText);

        // Decrypt Caesar Cipher
        String caesarDecryptedText = caesarCipherDecrypt(caesarCipherText, key);
        System.out.println("Caesar Cipher Decrypted Text: " + caesarDecryptedText);

        // Perform cryptanalysis
        cryptanalysis(plainText, caesarCipherText);

        scanner.close();
    }

    private static String caesarCipherEncrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                encryptedText.append((char) ((ch - base + key) % 26 + base));
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }

    private static String caesarCipherDecrypt(String text, int key) {
        return caesarCipherEncrypt(text, 26 - key); // Decryption is just encryption with the inverse key
    }

    private static void cryptanalysis(String original, String caesarCipher) {
        System.out.println("\nCryptanalysis Results:");

        System.out.println("Original Text: " + original);

        System.out.println("Caesar Cipher Decryption Attempts:");
        for (int i = 1; i <= 26; i++) {
            System.out.println("Key " + i + ": " + caesarCipherDecrypt(caesarCipher, i));
        }
    }
}