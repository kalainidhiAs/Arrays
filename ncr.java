package Array;

public class ncr {
    static int nCr(int n, int r) {

        int result = 1;

        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 69;
        int r = 43;

        System.out.println(nCr(n, r));
    }
}
