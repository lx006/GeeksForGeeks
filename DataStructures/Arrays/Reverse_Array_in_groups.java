class Solution 
{
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
        // code here
        for(int i=0;i<arr.size();i+=k)
        {
            int l=i;
            int r=Math.min(i+k-1,n-1);
            while(l<r)
            {
                int temp = arr.get(l);
                arr.set(l,arr.get(r));
                arr.set(r,temp);
                l++;
                r--;
            }
        }
    }
}
