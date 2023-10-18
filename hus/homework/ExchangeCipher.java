package hus.homework;

public class ExchangeCipher {
    public static String exchangeCipher(String inputString) {
        String str = inputString.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            cipherText += (char) ('Z' - (c - 'A'));
        }
        return cipherText.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(exchangeCipher("az"));
    }
}
