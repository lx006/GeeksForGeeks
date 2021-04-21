class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        //Method 1
        
       /* ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;
            int max=arr[i];
            while(j<arr.length)
            {
                max = Math.max(max,arr[j]);
                j++;
            }
            if(max==arr[i])
            {
                ans.add(arr[i]);
            }
        }
        return ans; */
        
        //Method 2
        
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(max<=arr[i])
            {
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
        
    }
}
