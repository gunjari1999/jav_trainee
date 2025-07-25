package ex_ples1;

public class vowels_1 {
    public static void main(String[] args) {
        char s = 'z';
        switch (s){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("yes its a vowel");
                break;

            default:
                System.out.println("its  a consonent");
        }

    }
}
