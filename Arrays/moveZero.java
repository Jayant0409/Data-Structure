// Move zeros to left of the array;

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
      }
      for(int i=j;i<nums.length;i++){
        nums[i]=0;
      }

    // int j=-1;
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]==0){
    //         j=i;
    //         break;
    //     }
    // }
    // int temp=0;
    // for(int i=j+1;i<nums.length;i++){
    //     if(nums[i]!=0){
    //         temp=nums[j];
    //         nums[j]=nums[i];
    //         nums[i]=temp;
    //         j++;
    //     }
    // }
        
    }
}