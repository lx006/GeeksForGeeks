class Solution
{
    
    public int exactly3Divisors(int N)
    {
        int count=0;
        for(int i=2;i<=N;i++)
        {
            if(isPrime(i))
            {
                int ans = i*i;
                if(ans<=N)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrime(int N)
    {
        boolean flag = false;
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                return false;
            }
        }
        return true;
    } 
}
