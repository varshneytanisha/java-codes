public class zeroonetriangle {
    public static void main(String args[]){
        int n = 5;
        int k =1;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
                // System.out.print(k+" ");
                //   k=k+1;
            }
           
    System.out.println();
}
    }
}

