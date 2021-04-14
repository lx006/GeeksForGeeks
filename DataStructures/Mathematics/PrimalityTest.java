class Solution{
    public:
        bool isPrime(int N)
    {
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                return false;
            }
        }
        return true;
    }
