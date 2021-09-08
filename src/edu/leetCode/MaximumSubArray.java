package edu.leetCode;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int end=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<length;i++){
            end=end+nums[i];
            if(max<end)
                max=end;
            if(end<0)
                end=0;
        }
        return max;
    }

    public static void main(String [] args){

        int []num={5,4,-1,7,8};
        MaximumSubArray subArray=new MaximumSubArray();
        System.out.println(subArray.maxSubArray(num));

    }
}
