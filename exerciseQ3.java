import java.util.*;
public class exerciseQ3 {
    public static int greatest(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
       
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter first no.");
        int a = sc.nextInt();
        System.out.println("enter seccond no.");
        int b = sc.nextInt();
       int greater = greatest(a,b);
       System.out.println("greater no. is:");
        System.out.println(greater);


    }
    
}
