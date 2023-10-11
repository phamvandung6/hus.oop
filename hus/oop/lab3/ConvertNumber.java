package hus.oop.lab3;
// Để tổng quát và giải quyết nhiều bài toán nhanh gọn em sẽ tạo một class ConvertNumber

public class ConvertNumber {
    // Hàm chuyển số từ hệ bất kì (radix) sang hệ thập phân 
    public static int convertFromBaseToDecimal(String str, int radix) {
        int decimal = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0';
            } else {
                digit = 10 + Character.toLowerCase(c) - 'a';
            }
            decimal += digit * Math.pow(radix, str.length() - 1 - i);
        }
        return decimal;
    }
    //hàm chuyển hệ bất kì(radix_from) phân sang hệ bất kì(radix_to)
    public static String convertFromBaseToBase(String str, int inRadix, int outRadix) {
        int decimal = convertFromBaseToDecimal(str, inRadix);
        StringBuilder result = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % outRadix;
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }
            result.insert(0, digit);
            decimal /= outRadix;
        }

        return result.toString();
    }
}
