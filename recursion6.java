public class recursion6 {
    public static void moveAllX(String str,int idx,int count, String newstring ){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstring +='x';
               
            }
            System.out.println(newstring);
             return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveAllX(str,idx+1,count, newstring);
            return;
        }
        else{
            newstring+=currentChar;
            moveAllX(str,idx+1,count,newstring);
        }
    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");

    }

}
