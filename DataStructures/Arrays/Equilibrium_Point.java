class Solution 
{

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) 
    {
        //Method 1
        
      /*  if(arr.length==1)
        {
            return 1;
        }
        long sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=0;
            for(int k=0;k<i;k++)
            {
                sum1+=arr[k];
            }
            
            sum2=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum2+=arr[j];
            }
            
            if(sum1==sum2)
            {
                return i+1;
            }
        }
        return -1; */
        
        //Method 2
        
        if(arr.length==1)
        {
            return 1;
        }
        long sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        long leftsum = 0;
        for(int j=0;j<arr.length;j++)
        {
            sum = sum-arr[j];
            if(leftsum==sum)
            {
                return j+1;
            }
            leftsum = leftsum+arr[j];
        }
        return -1;
    }
}
