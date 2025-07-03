package Array;

public class replace {
    public static void main(String[] args) {
        int a = 1001;
        String s = "" + a;

        StringBuilder newstring = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                newstring.setCharAt(i, '5');
            }
        }
        System.out.println(newstring.toString());
    }
}
