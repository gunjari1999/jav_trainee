package java_prac;

public class swi_sta {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        String cal = "+";
        int res = 0;
        switch (cal){
            case "%" :
                res = a%b;
                System.out.println(res);
                break;
            case "-" :
                res = a-b;
                System.out.println(res);
                break;
            case "+" :
                res = a+b;
                System.out.println(res);
                break;
            case "/" :
                res = a/b;
                System.out.println(res);
                break;
            case "*" :
                res = a*b;
                System.out.println(res);
                break;
        }

    }
}
