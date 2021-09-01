public class Solution {
    public int search(int[] nums, int target) {
        for (int i=0; i < nums.length;i++){
            while (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = 15 / 2;
        System.out.println(i);
    }
}
