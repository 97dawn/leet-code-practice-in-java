public class MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums , int from , int to){
        if(from == to){
            return null;
        }
        int maxIndex = max(nums, from , to);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = construct(nums, from, maxIndex);
        root.right = construct(nums, maxIndex+1, to);
        return root;
    }
    public int max(int[] nums, int from, int to){
        int max = from;
        for(int i=from ; i < to ; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
