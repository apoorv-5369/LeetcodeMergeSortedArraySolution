class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for(int i=0; i<arr.length;i++){
            arr[i]=nums1[i];
            if(arr[i]==0&&i>m-1) arr[i]=nums2[i-m];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
            System.out.print(nums1[i]);
        }
        
    }
}
