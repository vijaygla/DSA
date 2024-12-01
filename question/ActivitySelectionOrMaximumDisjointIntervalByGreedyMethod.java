import java.util.*;

public class ActivitySelectionOrMaximumDisjointIntervalByGreedyMethod {

    static class Activity {
        int start, finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int finish = sc.nextInt();
            activities[i] = new Activity(start, finish);
        }

        sc.close();

        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        int count = 1;
        int lastFinishTime = activities[0].finish;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastFinishTime) {
                count++;
                lastFinishTime = activities[i].finish;
            }
        }

        System.out.println("Maximum number of non-overlapping activities: " + count);
    }
}
