public class fact {
    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_n2 = calcfactorial(n - 1);
        int fact_n = n * fact_n2;
        return fact_n;

    }

    public static void main(String args[]) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);

    }

}