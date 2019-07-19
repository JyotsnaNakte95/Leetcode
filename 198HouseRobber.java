class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        else if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2){
            int u=Math.max(nums[0],nums[1]);
            return u;
        }
        else{
        int[] solution = new int[nums.length];
        solution[0]=nums[0];
        solution[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            for(int j=i-2;j>=0;j--){
                solution[i]=Math.max(solution[i],nums[i]+solution[j]);
            }
        }
        System.out.println(Arrays.toString(solution));
        int maximum=0;
        for(int i=0;i<nums.length;i++){
            if(solution[i]>maximum){
                maximum=solution[i];
            }
        }
        
        
        return maximum;
        }
    }
}