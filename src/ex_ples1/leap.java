package ex_ples1;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        System.out.println("enter a year = ");
        int yr = lp.nextInt();
        if(yr%400==0 && yr%100 !=0 || yr%4 == 0){
            System.out.println("yes it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}

