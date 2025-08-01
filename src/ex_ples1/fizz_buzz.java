package ex_ples1;

public class fizz_buzz {
    //1 to 100 3 divisible fizz and 5 divisible buzz and 3and 5 divisible fizzbuzz
    public static void main(String[] args) {
        //nt a = 1;
        for(int a=1;a<=100;a++){
            if(a%3==0 && a%5==0){
                System.out.println(a + "fizzbuzz");
            }
            else if(a%5 == 0){
                System.out.println(a+"buzz");

            }
            else if(a%3==0){
                System.out.println(a+ "fizz");
            }

        }
    }
}
