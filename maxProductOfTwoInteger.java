package Array;

public class maxProductOfTwoInteger {
    public String maxProduct(int[] intArray) {
        int max = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > max) {
                    max = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int intArray[] = { 10, 40, 50, 100, 90 };
        maxProductOfTwoInteger newmax = new maxProductOfTwoInteger();
        String max = newmax.maxProduct(intArray);
        System.out.println(max);
    }
}

/*
 * Arrays.sort(intArray);
 * int a = intArray[intArray.length - 2];
 * int b = intArray[intArray.length - 1];
 * 
 * return (a + "," + b);
 */