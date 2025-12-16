// You are given an array arr of positive integers. Your task is to find all the
//  leaders in the array. An element is considered a leader if it is greater than or equal 
//  to all elements to its right. The rightmost element is always a leader.


class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int n=arr.length;
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
            }
            max=Math.max(max,arr[i]);
            
        }
        // int ar[]=list.toArray(new int[0]);
        Collections.reverse(list);
     return list; 
    }
}
