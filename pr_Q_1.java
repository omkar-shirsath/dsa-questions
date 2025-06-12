/*
 Question 1:
 Given an integer array nums,
return true if any value appears at least twice in the array, 
and return false if every element is distinct.
 Example 1:Input:nums = [1, 2, 3, 1]
 Output:   true 
 Example 2:Input:nums = [1, 2, 3, 4]Output:   false 
 Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true 
 Constraints:
 • 1 <= nums.lengtth <= 105
 • -109 <= nums [ i ] <= 109
 */

import java.util.HashSet;
public class pr_Q_1 {
    public static boolean appears_mulitiple_times(int nums []){

        //brute force approch

        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }

        // }
        // return false;

        //usign hashtable

        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String args[]){
        int nums [] ={1, 2,3,4};
        System.out.println(appears_mulitiple_times(nums));

    }
}
