
public class LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
        int maxIndex=-1;
        int max = -1;
        for(int i=0 ; i < nums.length ; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] * 2 > max && i != maxIndex ){
                return -1;
            }
        }
        return maxIndex;
    }
}
