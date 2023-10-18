package hus.homework;

public class CaesarCode {
    public static String caesarCipher(String inputString, int n) {
        String str = inputString.toUpperCase();

        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            cipherText += (char) ('A' + (((c - 'A') + n) % 26));
        }
        return cipherText.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Testing", 3));
    }
}
