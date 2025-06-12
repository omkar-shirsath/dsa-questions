/*

🧩 Problem Statement: Trapping Rain Water
You are given an array height[] of non-negative integers where each element represents the height of a block, and the width of each block is 1.

Imagine this array as a bar chart where the width of each bar is 1. Compute how much water can be trapped between the bars after raining.

🧮 Example:
Input:


height = {4, 2, 0, 6, 3, 2, 5}
Output:
11
Explanation:

Water is trapped in valleys between the bars.

Total trapped water = 11 units.

📥 Input:
An integer array height[] of size n
0 <= height[i] <= 10^5

n >= 1

📤 Output:
Return a single integer: total units of rain water that can be trapped.

✅ Constraints:
1 <= height.length <= 10^5

0 <= height[i] <= 10^5

💡 Follow-Up:
Can you solve it in O(n) time and O(1) space?
(Hint: Two-pointer approach)

 */

 //solution 
public class traped_rainwater{
    public static int trapedwater(int height[]){
        
        int n = height.length;
        //calculate the leftmax boudary for each bar - using auxilory array for it also called helper array
        int lmb []= new int[n];
        lmb[0]=height[0];
        for(int i =1;i<n;i++){
            lmb[i]= Math.max(height[i],lmb[i-1]);
        }

        //calculate the right max boudary for each bar
        int rmb[]=new int[n];
        rmb[n-1]=height[n-1];
        for(int i = n-2;i>=0;i--){
            rmb[i]=Math.max(height[i],rmb[i+1]);
        }

        //calculating total rain wather traped
        int tw =0;

        for(int i = 0;i<n;i++){
            //caluculat the traped water on each bar = (water level - height of bar)*width
            //calculate wather level for each bar = Min(left boudary, right boudary)
            int width = 1;
            int wl = Math.min(lmb[i],rmb[i]);

            tw +=(wl-height[i])*width;
        }

        return tw;
    }
    public static void main(String args[]){
        int height[]= {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapedwater(height));
    }
}