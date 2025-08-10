package Array;

public class majorityElements {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int val : nums) {
            int freq = 0;
            for (int el : nums) {
                if (el == val) {
                    freq++;
                }
            }
            if (freq > n / 2) {
                return val;
            }
        }
        return -1; // No majority element
    }
    public static void main(String args[]){
        int[] nums ={3,2,3};
        majorityElements result = new majorityElements();
        System.out.println(result.majorityElement(nums));
    }
}
