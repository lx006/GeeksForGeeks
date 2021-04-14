class Solution
{
    
  public int modInverse(int a, int m)
    {
      /*int x = (int)(Math.pow(a,m-2)) % m ;
      return x; */
      int modulo=0;
      for(int i=1;i<m;i++)
      {
          int ans = (a*i)%m;
          if(ans==1)
          {
              modulo = i ;
          }
      }
      if(modulo==0)
      {
          return -1;
      }
      return modulo;
    }

}
