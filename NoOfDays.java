package Array;

public class NoOfDays {
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day1 = y1 * 365 + d1;
        for (int i = 0; i < m1 - 1; i++) {
            day1 += months[i];
        }

        day1 += countLeapYear(y1, m1);

        int day2 = y2 * 365 + d2;
        for (int i = 0; i < m2 - 1; i++) {
            day2 += months[i];
        }

        day2 += countLeapYear(y2, m2);

        return Math.abs(day2 - day1);
    }

    public static int countLeapYear(int year, int month) {
        if (month <= 2) {
            year--;
        }
        return year / 4 - year / 100 + year / 400;
    }

    public static void main(String[] args) {
        System.out.println(noOfDays(30, 12, 2001, 18, 9, 2003));
    }
}
