package ex_ples1;
import java.lang.Math;

public class ternary_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 45;
        int d = (a >c) ?((a>c) ? a : c):((b>c) ? b : c);
        System.out.println(d);

    }
}
