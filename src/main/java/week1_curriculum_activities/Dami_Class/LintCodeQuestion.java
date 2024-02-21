package week1_curriculum_activities.Dami_Class;

public class LintCodeQuestion {
    public static void main(String[] args) {

    }

    /*

         Question 1: Check if a number is a majority element in a set of array
         Input: nums = [1,2,3,4,4,4,4,4,4,5,6], target = 4
         Output : true

         Explanation:
         The number 4 appears 6 times and the length of the array is 11.
         Since 6 > 11 // 2
         So the number 4 is the majority element of nums.



         class Solution {
         public static void main(String[] args) {
         public boolean IsMajorityElement (int[] nums, int target) {
         int count = 0;
         for(int i=0; i < nums.Length; i++) {
         for(int j=0; j < nums.Length; j++) {
         if(nums [i] == nums [j]) {
         count++;
         }
         if(count > (nums.Length / 2) && nums[i] == target) {
         return true;
         }
         count = 0;
         }
         return false;
         }
         }




         //If you want to know the highest frequency when target isn't given.
         class Solution {
         public static void main(String[] args) {
         int[] nums = {1,2,3,4,4,4,4,4,4,5,6}
         System.out.println(IsMajorityElement(nums));

         public static int IsMajorityElement (int[] nums) {
         int count = 0;
         int max_frq = 0;
         for(int i=0; i < nums.Length; i++) {
         for(int j=0; j < nums.Length; j++) {
         if(nums [i] == nums [j]) {
         count++;
         }
         if(count > max_frq) {
         max_frq = count;
         max_frq = nums[i]
         }
         return max_frq;
         }




         //From the above example, this is how to count how many times the most frequent number appeared.
         }
         if (count > max_frq) {
         max_frq = count;
         }
         count = 0;
         }
         return max_frq;
     }
     }



          Question 2: Array of Products
          Write a function that takes a non-empty array of integers and return the array of the same
          length, where each element in the input array is equal to the product of every other number
          in the input array.
          In other words, the value at output[i] is equal to the product of every number in the input
          array.
          input [5,1,2,4]

         class Solution {

    public static int[] productArray(int[] nums) {
        int product = 1;
        int i;
        int j;
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                product *= nums[j];
            }
            output[i] = product / nums[i];
            product = 1;
        }
        return output;

        public static void main (String[] args) {
            int[] arr = {5, 1, 4, 2};
            int[] output = productArray(arr);

            System.out.println(Array.toString(output));
        }
    }
    */
}


