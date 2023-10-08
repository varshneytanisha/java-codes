import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        char operator;
        double a,b, result;
        Scanner input =new Scanner(System.in);
        System.out.println("choose an operator: +, _, *, /, %");
       operator = input.next().charAt(0);
         a= input.nextDouble();
         b = input.nextDouble();
       

        
        switch(operator){
            case '+' :
           result = a + b;
           System.out.println(result);
           break;
           case '_' :
           result = a - b;
           System.out.println(result);
           break;
           case '*' :
           result = a*b;
           System.out.println(result);
           break;
           case '/' :
           result = a/b;
           System.out.println(result);
           break;
           case '%' :
           result = a%b;
           System.out.println(result);
           break;
           default : System.out.println("invalid operator");


        }
    }
}