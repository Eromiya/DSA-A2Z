package com.striver.a2z.arrays.medium;

public class RearrangeBySignInArray_2149 {

    // Most Efficient
    public int[] rearrangeArray2(int[] nums) {
        int[] ans=new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
            else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return ans;

    }
    // Efficient Approach
    public int[] rearrangeArray1(int[] nums) {
        int n = nums.length;
        int[] neg = new int[n/2];
        int[] pos = new int[n/2];
        int l = 0;
        int m=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[l++] = nums[i];
            }
            else {
                pos[m++] = nums[i];
            }
        }
        int k=0;
        int i=0,j=0;
        while(i<l&&j<m){
            nums[k++] = pos[j];
            nums[k++] = neg[i];
            j++;
            i++;
        }

        while(i<l){
            nums[k++] = neg[i++];
        }

        while(j<m){
            nums[k++] = pos[j++];
        }
        return nums;
    }


    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] res = new int[n];
        int i=0;int j=0;
        boolean flag= true;
        int k=0;
        while(i<n && j<n){
            if(flag){
                if(nums[i]>=0){
                    flag =!flag;
                    res[k++] = nums[i];
                }
                i++;
            }
            else if(!flag){
                if(nums[j]<0){
                    flag =!flag;
                    res[k++] = nums[j];
                }
                j++;
            }
        }

        while(i<n){
            if(nums[i]>0){
                res[k++] = nums[i];
            }
            i++;
        }
        while(j<n){
            if(nums[j]<0){
                res[k] = nums[j];
            }
            j++;
        }
        return res;
    }
}
