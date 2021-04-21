public static void convertToWave(int arr[], int n)
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            count++;
            if(count%2!=0)
            {
                int num = arr[i];
                int num2 = arr[i+1];
                arr[i] = Math.max(num,num2);
                arr[i+1] = Math.min(num,num2);
            }
            else
            {
                int num = arr[i];
                int num2 = arr[i+1];
                arr[i] = Math.min(num,num2);
                arr[i+1] = Math.max(num,num2);
            }
        }
    }
    
