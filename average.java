import java.util.*;
public class average {
    public static float average(int x,int y, int z){
        int average = (x+y+z)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        float average = average(a,b,c);
        System.out.println("average of three numbers is:",average);
     // float average = average(a,b,c);
      // System.out.println(average);

    }
    
}
