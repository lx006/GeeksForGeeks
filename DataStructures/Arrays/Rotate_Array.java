class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        int k=gcd(d,n);
        for(int i=0;i<k;i++)
        {
            int temp = arr[i];
            int j=i;
            while(true)
            {
                int r = j+d;
                if(r>=n)
                {
                    r=r-n;
                }
                if(r==i)
                    break;
                arr[j]=arr[r];
                j=r;
            }
            arr[j]=temp;
        }
    }
    public static int gcd(int d,int n)
    {
        if(d==0)
        {
            return n;
        }
        else
        {
            return gcd(n%d,d);
        }
    }
    
}
