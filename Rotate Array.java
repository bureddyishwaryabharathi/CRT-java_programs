class Solution{
        public void reverse(int[] a,int l,int r){
            while(l<r){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
        public void rotate(int[] nums,int k){
            int n=nums.length;
    k=k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);


        

    
}
}
