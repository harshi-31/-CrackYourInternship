class Solution {
    public int removeDuplicates(int[] nums) {
        /*int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;*/
        Set<Integer>set=new HashSet<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!set.contains(num)){
            set.add(num);
            nums[index++]=num;
            }
        }
        return set.size();
    }
}
