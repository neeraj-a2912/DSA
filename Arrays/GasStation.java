import java.util.Arrays;
public class GasStation {
    
}
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total =0, res = 0;
        if(Arrays.stream(cost).sum()>Arrays.stream(gas).sum()){
            return -1;
        }
        for(int i=0; i<gas.length; i++){
            total += gas[i] - cost[i];
            if(total<0){
                total = 0;
                res = i + 1;
            }
        }
        return res;
    }
}