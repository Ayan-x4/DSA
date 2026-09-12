class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int m = 0; int n = nums.length-1;
        while(m<n){
            int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;
            m++;
            n--;
        }
        int i =0; int j = k-1;
        while(i<j){
            int temp =nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int p = k ; int l = nums.length-1;

        while(p<l){
            int temp = nums[p];
            nums[p] = nums[l];
            nums[l] = temp;
            p++;
            l--;
        }
        
    }
}