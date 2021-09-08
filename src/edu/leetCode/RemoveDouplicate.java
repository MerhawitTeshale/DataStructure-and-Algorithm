package edu.leetCode;


import javax.swing.plaf.synth.SynthEditorPaneUI;

public class RemoveDouplicate {

    public  int removeDuplicates(int[] nums) {

        int count=0;
        int j=0;
        int [] temp=new int [nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                temp[j++]=nums[i];
                count++;
            }
        }
        temp[j++]=nums[nums.length-1];

            nums=temp;
        for (int i=0;i<nums.length;i++){
           System.out.println(nums[i]);

        }
            count=nums.length-(count+1);
        return count;
    }

    public static void main(String [] args){
        int [] nums={0,0,1,1,1,2,2,3,3,4};
        RemoveDouplicate removeDouplicate=new RemoveDouplicate();
        System.out.println(removeDouplicate.removeDuplicates(nums));
    }

}
