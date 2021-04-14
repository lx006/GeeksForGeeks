
class Solution
{
    public int digitsInFactorial(int N)
    {
       /* long factAns = Factorial(N);
        int count = (int) (Math.log10(factAns)+1);
        return count; */
        double count = 0.0d;
        if(N==0)
        {
            return 1;
        }
        else if(N<0)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=N;i++)
            {
                count = count + Math.log10(i);
            }
        }
        int ans = (int) Math.floor(count)+1;
        return ans;
    }
    
   /* public static long Factorial(int N)
    {
        long fact = 1;
        while(N!=0)
        {
            fact = fact*N;
            N--;
        }
        return fact;
    } */
}
