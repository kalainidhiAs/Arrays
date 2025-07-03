package Array;

import java.util.*;

public class NmeetingInOneRoom {

    static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxMeetings(int start[], int end[]) {
        // add your code here

        if (start.length == 0 || end.length == 0) {
            return 0;
        }

        int n = start.length;
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }

        // for (Meeting meet : meetings) {
        // System.out.println(meet.start + " " + meet.end);
        // }

        Collections.sort(meetings, Comparator.comparingInt(meeting -> meeting.end));

        int count = 1;
        int lastEndTime = meetings.get(0).end;

        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start > lastEndTime) {
                count++;
                lastEndTime = meetings.get(i).end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int start[] = { 75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924 };
        int end[] = { 112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };

        System.out.println(maxMeetings(start, end));
    }
}
