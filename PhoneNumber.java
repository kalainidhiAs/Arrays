package Array;

import java.util.*;

public class PhoneNumber {

    private static Map<Character, List<Character>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        // System.out.println(map);
    }

    private static void generateFromPhoneDigits(String s, String currentWord, List<String> list) {
        if (s.length() == 0) {
            list.add(currentWord);
            System.out.println(list);
            return;
        }

        char digit = s.charAt(0);
        List<Character> letters = map.get(digit);
        // System.out.println(letters);
        for (char letter : letters) {
            System.out.println(s.substring(1));
            generateFromPhoneDigits(s.substring(1), currentWord + letter, list);
        }
    }

    public static void main(String[] args) {
        String s = "23";
        List<String> list = new ArrayList<>();
        generateFromPhoneDigits(s, "", list);
        for (String word : list) {
            System.out.println(word);
        }
    }
}
