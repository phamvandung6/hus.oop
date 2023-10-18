package hus.homework;

public class DecipherCaesarCode {
    public static String caesarDecipher(String inputString, int n) {
        String str = inputString.toUpperCase();

        String caesarDecipher = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            caesarDecipher += (char) ('A' + (c - 'A' - n + 26) % 26);
        }
        return caesarDecipher.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(caesarDecipher("az", 3));
    }
}
