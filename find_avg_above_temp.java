package Array;

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many days?");
        int days = in.nextInt();
        int temparr[] = new int[days];
        for (int i = 0; i < days; i++) {
            System.out.print("enter day " + (i + 1) + " 's temperature: ");
            int temp = in.nextInt();
            temparr[i] = temp;
            sum = sum + temp;
        }
        double average = (double) sum / days;
        System.out.println("Average of temperature: " + average);

        for (int i = 0; i < days; i++) {
            if (temparr[i] > average) {
                count++;
            }
        }
        System.out.println("Days with temperature above the average: " + count);
        in.close();
    }
}
