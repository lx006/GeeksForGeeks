class Solution 
{
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) 
    {
        int divisor = 2*a;
        ArrayList<Integer> arr = new ArrayList<>();
        if((b*b)<(4*a*c))
        {
            arr.add(-1);
        }
        else
        {
            int r1 = (int) Math.floor((-b + Math.sqrt(b*b-4*a*c))/divisor);
            int r2 = (int) Math.floor((-b - Math.sqrt(b*b-4*a*c))/divisor);
            if(r1<r2)
            {
                arr.add(r2);
                arr.add(r1);
            }
            else
            {
                arr.add(r1);
                arr.add(r2);
            }
        }
        return arr;
        // code here
    }
}
