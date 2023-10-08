import java.util.*;

public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        sb.append("e"); // str = str +"e";

        System.out.println(sb.length());
        // // delete
        // sb.delete(1, 3);
        // System.out.println(sb);
        // //insert
        // sb.insert(0, 's');
        // System.out.println(sb);
        // // char at index
        // System.out.println(sb.charAt(0));
        // // set char at inndex
        // sb.setCharAt(0, 'p');

        // System.out.println(sb);

    }

}
