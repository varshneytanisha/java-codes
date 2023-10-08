import java.util.*;

public class bitManipulation {
    public static void main(String args[]) {
        // //get bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // if ((bitMask & n) == 0) {
        // System.out.println("bit was zero");
        // } else {
        // System.out.println("bit was one");
        // }
        // set bit
        // conversion of a number using bit manipulation
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);
        // clear bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);
        // update bit
        // there are two cases i.e, for 0 and 1
        // for 0 it is clear operation and for 1 it is set operation
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // operl: set operal:clear
        int n = 5;// 0101-> 0111->dec 7
        int pos = 1;
        // set oper
        int bitMask = 1 << pos;
        if (oper == 1) {
            // set

            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }

    }

}
