package ex_ples1;

public class para_ret {
    public static void main(String[] args) {
        String name = funct5("raghav");
       System.out.println(name);
       double c = funct6(250,250);
        System.out.println(c);
    }
    public static String funct5(String name){
        System.out.println("with parameter and with returntype");
       return name ;
    }
    public static double funct6(double a,double b){
        System.out.println("with parameter and with returntype");
        return a+b ;
    }

}
