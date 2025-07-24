package ex_ples1;

public class tpe_cast2 {
    public static void main(String[] args) {
        // narrowing exp and implicit
        int a = 300;
      //  byte b = a; we can get an error because without giving data type name jvm doen't execute.
        // it is known as narrowing implicit we get error only explicit we can use...
        byte b = (byte)a;
        System.out.println(b);
    }
}
