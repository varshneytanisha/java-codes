import java.util.*;
public class solutions {
    public static void main(String args[]){
        int positive = 0,negative = 0,zeroes = 0;
        System.out.println("press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input==1){
            System.out.println("enter your number");
            int number = sc.nextInt();
            if(number>0){
                positive++;

            }
            else if(number<0){
                negative++;

            }
            else{
                zeroes++;
            }
            System.out.println("positives:"+ positive);
            System.out.println("negatives:"+ negative);
            System.out.println("zeroes:"+ zeroes);
        //             System.out.println("press 1 to continue and 0 to stop");
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();

        }
    }
    
}
