import java.util.HashSet;

public class recursion9 {
    public static void subsequences(String str, int idx, String newString, HashSet<String> Set) {
        if (idx == str.length()) {
            if (Set.contains(newString)) {

                return;
            } else {
                System.out.println(newString);
                Set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newString + currChar, Set);

        // not to be
        subsequences(str, idx + 1, newString, Set);

    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> Set = new HashSet<>();
        subsequences(str, 0, "", Set);

    }

}
