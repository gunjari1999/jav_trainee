package ex_ples1;

public class marks_swi {
    public static void main(String[] args) {
        int a = 55;
        int res = 0;
        switch(a){
            case 85:
                if(a<=90){
                    System.out.println("you got a A grade");
                }
                break;
            case 95:
                if(a<=100){
                    System.out.println("you got a A+ grade");
                }
                break;
            case 75:
                if(a<=80){
                    System.out.println("you got a b+ grade");
                }


                break;
            default:
                System.out.println("you just passed");


        }
    }
}
