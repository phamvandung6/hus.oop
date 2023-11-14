package hus.homework;

public class FibonancciInt {
    public static void main(String[] args) {
        int fb1 = 1;
        int fb2 = 1;
        int fbn = 0;
        int i = 1;
        System.out.println("F(" + 0 + ") = " + fb2);
        System.out.println("F(" + 1 + ") = " + fb1);
        while (true) {
            i++;
            fbn = fb1 + fb2;
            if (Integer.MAX_VALUE - fb1 >= fb2) {
                System.out.println("F(" + i + ") = " + fbn);
            } else {
                System.out.println("F(" + i + ") is out of the range of int");
                break;
            }
            fb1 = fb2;
            fb2 = fbn;
        }
    }

}
