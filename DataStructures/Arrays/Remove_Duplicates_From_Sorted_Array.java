class Solution 
{
    int remove_duplicate(int A[],int N)
    {
        int j=0;
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]!=A[i+1])
            {
                A[j]=A[i];
                j++;
            }
        }
        A[j]=A[N-1];
        return j+1;
    }
   
}
