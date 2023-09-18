public class CountPairs2 {
    public static int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        int count = 0;
        int i=0, j=n-1;
        while(i<j){
            if(a[i]+a[j]==sum){
                count++;
                i++; j--;
            }else if(a[i]+a[j]>sum){
                j--;
            }else{
                i++;
            }
        }
        if(count != 0)
        return count;
        else
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
