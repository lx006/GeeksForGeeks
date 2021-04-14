class Solution
{
    public static long getSmallestDivNum(int n)
    {
        long gcd = 1;
        long lcm = 1;
        
        for(int i=1;i<=n;i++)
        {
            long mul = gcd(lcm,i);
            lcm = lcm*i/mul;
        }
        return lcm;
    }
    
    public static long gcd(long a, long b)
    {
        if(a==0)
        {
            return b;
        }
        else
        {
            return gcd(b%a,a);
        }
    }
}

