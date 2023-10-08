import java.util.*;
public class exerciseQ4 { //float pie = 3.14;
    public static double circumference(double r){
          
        return 2 * 3.14 * r; 
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
       double r = sc.nextDouble();
       //double circumference = circumference(r);
        System.out.println(circumference(r));


}
    
}
