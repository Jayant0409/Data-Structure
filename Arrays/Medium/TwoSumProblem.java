// import java.util.HashMap;
class TwoSumProblem{
    // public int[] twoSum(int[] nums, int target) {
    //        int n = nums.length;
    //        int num,moreNeeded;
    //        HashMap<Integer,Integer>map = new HashMap<>();
    //        for(int i=0;i<n;i++){
    //             num=nums[i];
    //             moreNeeded = target - num;
    //             if(map.containsKey(moreNeeded)){
    //                 return new int[]{map.get(moreNeeded),i};
    //             }
    //             else
    //             map.put(num,i);
    //        }
    //        return new int[]{-1,-1};
    //        }

        public static String twoSum(int[] nums, int target) {
               int sum=0;
                int left=0;
                int right=nums.length - 1;
                while(left<right){
                    sum=nums[left]+nums[right];
                    if(sum==target)
                    return "yes";
                    else if(sum<target)
                    left++;
                    else
                    right--;
                }
                return "no";
        }

        public static void main(String[] args) {
            int ar[] ={2,7,11,15};
            int t=10;
            System.out.println(twoSum(ar, t));
        }

    }



