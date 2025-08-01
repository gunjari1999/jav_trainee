package ex_ples1;

import java.util.Scanner;

public class triiso_equa_scal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        int a= sc.nextInt();
        System.out.println("enter the value of a = ");
        int b = sc.nextInt();
        System.out.println("enter the value of a = ");
        int c = sc.nextInt();
        if(a == b && a==c && b==c){
            System.out.println("yes it is equalateral triangle");
        }
        else if(a==b || a==c ||b==c){
            System.out.println("yes it is iso traingle ");
        }
        else{
            System.out.println("yes it is scalen traingle");
        }
    }
}
