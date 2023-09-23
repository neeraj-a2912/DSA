import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] result = new long[n];
        Arrays.fill(result,1);
        long prefix = 1, postfix = 1;
        for(int i=0;i<n;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        for(int i=n-1;i>=0;i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
	} 
}
