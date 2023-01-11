class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<nums1.length;i++){
            sum1 = sum1+nums1[i];
            sum2++;
            System.out.println(sum2);
        }
        for(int j =0; j<nums2.length;j++){
            sum1 = sum1+nums2[j];
            sum2++;
            System.out.println(sum2);
        }
        double y = sum1; 
        double z = sum2;
        double x = y/z;
        return x;
    }
}

\\ a program that gets the median of two arrays size n and m in O(n+m) time and constant overhead
