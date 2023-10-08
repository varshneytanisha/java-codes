import java.util.*;
public class odd {
    public static void odd(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            if((i%2)!=0){
                
            // }
            // else{
                sum =sum +i; 
            }
            
    }
    System.out.println(sum);
}
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number");
        int n = sc.nextInt();
        // int odd = odd(n);
        // System.out.println("odd numbers from 1 to n :");
        // System.out.println(odd);
        odd(n);


    }

}


    

