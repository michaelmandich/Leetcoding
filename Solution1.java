class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = {0,0};
        int a,b;
        for(int i =0; i<(nums.length-1);i++){
            a = nums[i];
            for(int j = (i+1); j<(nums.length);j++){
                b = nums[j];
                if(a+b == target){
                    sol[0] = i;
                    sol[1] = j;
                }
            }
        }    
        return sol;         
    }
}