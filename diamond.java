public class diamond {
    public static void main(String args[]){
        int n =4;
        //outer loop
        for(int i =1;i<=n;i++){
            //inner loop
            //spaces
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
        //lower HALF
        for(int i =n;i>=1;i--){
            //inner loop
            //spaces
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
    
}
