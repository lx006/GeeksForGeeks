class Solution 
{
    public static long sumUnderModulo(long a, long b)
    {
      long ans1 =  a % (long) (Math.pow(10,9)+7);
      long ans2 = b % (long)(Math.pow(10,9)+7);
      long ans = ((ans1 + ans2)% (long)(Math.pow(10,9)+7));
      return ans;
    }   
}
