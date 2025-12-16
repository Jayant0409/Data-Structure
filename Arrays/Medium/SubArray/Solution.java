import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestSubarray(int[] arr, int k) {
    
// Better solution

        int n=arr.length;
        Map<Long , Integer> preSumMap =new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            long rem = sum-k;
            
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
    return maxLen;



//   optimal , 2 Pointer approch
//  optimal solution is only for positive array

    int right = 0;
    int left = 0;
    long sum = arr[0];
    int n=arr.length;
    int maxLen=0;
     
     while(right < n){
         
         while(left <= right && sum > k){
             sum = sum - arr[left];
             left++;
         }
         
         if(sum == k){
             maxLen = Math.max(maxLen, right-left + 1);
         }
         right++;
         if(right<n){
         sum=sum+arr[right];
     }
     }
     return maxLen;
     

}
}
