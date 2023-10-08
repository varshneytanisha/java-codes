import java.util.*;
public class exercciseQ5 {
    public static void vote(int x){
        if(x>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        vote(age);

    }
    
}
