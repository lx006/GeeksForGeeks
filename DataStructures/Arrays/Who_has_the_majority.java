int majorityWins(int arr[], int n, int x, int y) 
{
    int countx = 0, county=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==x)
        {
            countx++;
        }
        else if(arr[i]==y)
        {
            county++;
        }
    }
    if(countx==county)
    {
        if(x>y)
        {
            return y;
        }
        else
        {
            return x;
        }
    }
    if(countx>county)
    {
        return x;
    }
    return y;
    
}
