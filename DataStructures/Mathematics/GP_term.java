class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        double term = 0.00000d;
        if(N==1)
        {
            term = (double) A;
        }
        else if(N==2)
        {
            term = (double) B;
        }
        else
        {
            double ratio = (double)B/A;
            term = A * Math.pow(ratio,N-1);
        }
        return term;
    }

}
