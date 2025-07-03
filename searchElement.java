package Array;

public class searchElement {
    public int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("No element found");
    }

    public static void main(String[] args) {
        int intArray[] = { 10, 20, 30, 40, 50 };
        int valueToSearch = 40;
        searchElement newsearch = new searchElement();
        int found = newsearch.searchInArray(intArray, valueToSearch);
        System.out.println(found);
    }
}