import java.util.HashSet;

public class candyDistribution {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int candy: candyType){
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length/2);
    }
    public static void main(String[] args) {
        // take inputs accordingly
    }
}
