package Array;

public class NoOfDaysTwo {
    static boolean isLeap(int y) {
        // if the year is divided by 4
        if (y % 4 == 0) {

            // if the year is century
            if (y % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                // if the year is not century
                return true;
            }
        }

        return false;
    }

    static int YearToDays(int y) {

        if (isLeap(y)) {
            return 366;
        }
        return 365;
    }

    static int findDayBetweenYear(int y1, int y2) {
        int days = 0;
        for (int i = y1; i < y2; i++) {
            days += YearToDays(i);
        }
        return days;
    }

    static int monthToday(int m, int y) {
        int arr[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sum = 0;
        for (int i = 1; i < m; i++) {
            if (isLeap(y) && i == 2) {
                sum++;
            }
            sum += arr[i];
        }
        return sum;
    }

    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        if (y2 < y1) {
            return noOfDays(d2, m2, y2, d1, m1, y1);
        }

        int total = findDayBetweenYear(y1, y2);
        total -= (d1 + monthToday(m1, y1));
        total += (d2 + monthToday(m2, y2));

        return total < 0 ? -total : total;
    }

    public static void main(String[] args) {
        System.out.println(noOfDays(1, 1, 2019, 1, 1, 2024));
    }
}
