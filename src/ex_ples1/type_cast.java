package ex_ples1;

public class type_cast {
    public static void main(String[] args) {
    /*    float a = 10f;
      int b = 10; //remeber operator tabel
        float c =  a+ b ;
        System.out.println(c);*/
        /*widening implicit
       */
        byte a = 10;
        int b = a; // widening implicit internal jvm can identify it widening implicet
        int b1 = (int) a; // we have to give external data type  so it is widening explicet
        System.out.println(b1);
    }
}
