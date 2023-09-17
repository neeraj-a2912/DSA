import java.util.*;

public class ChocolateDistribution {
    public int findMinDiff(ArrayList<Integer> a, int N, int M) {
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        int i = 0, j = i + M - 1;
        while (j < N) {
            int currMin = a.get(j) - a.get(i);
            if (currMin < min) {
                min = currMin;
            }
            i++;
            j++;
        }
        return min;
    }

    public static void main(String[] args) {
        // Take Inputs accordingly
    }
}