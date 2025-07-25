package ex_ples1;

public class cel_farhen {   /// °F = (°C × 9/5) + 32
public static void main(String[] args) {
    int cel = 30;
    long cel1 = 0;
    switch(cel){
        case 20:
            cel1 = (cel*9/5) +32;
            System.out.println(cel1+ " farhen to celcius converter");
            break;        case 10:
            cel1 = (cel *9/5) +32;
            System.out.println(cel1+ " farhen to celcius converter");
            break;
        case 30:
            cel1 = (cel *9/5) +32;
            System.out.println(cel1+ " farhen to celcius converter");
            break;
        default:
            System.out.println("not reachable");
    }
}
}
