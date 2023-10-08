import java.util.*;
public class searchArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size=sc.nextInt();
         int array[]=new int[size];
         //input
         System.out.println("enter the elements of array:");
         for(int i =0;i<size;i++){
            array[i]=sc.nextInt();
         }
         //search for number
         System.out.println("enter number to be searched");
         int number = sc.nextInt();
         
         for(int i=0;i<size;i++){
            if(array[i]==number){
                System.out.println("number is present at index:"+ i);
               
            }
           
            
                
            
         }
        // System.out.println("number is not in the array");

    }
   

    
}
