import java.util.*;
public class functionAdd{
    // public static int AddMyNumbers(int x ,int y){
    //     int sum = x+y;
    //     //System.out.println("sum of 2 numbers is :",sum);
    //     return sum;
    // public static int calculateProduct(int x ,int y){
    //     int mul = x*y;
    //     return mul;
    // } 
    public static void calculateFactorial(int n){
        //loop
        if(n<0){
            System.out.println("invalid no.");
            return;
        }
        int factorial = 1;
        for(int i =n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
calculateFactorial(n);


     //  int sum= AddMyNumbers(a,b);
      
    //   // System.out.println(sum);
    //   int mul = calculateProduct(a,b);
    //   System.out.println("product is:");
    //   System.out.println(mul);

    }
}