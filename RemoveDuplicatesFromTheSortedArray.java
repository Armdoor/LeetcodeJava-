class Solution
{
    public int removeDuplicates(int[] a) 
    {
       int i=1,j=0;
        while (i<a.length)
        {
            if (a[i]!=a[j])
            { j++;
                a[j]=a[i];}
            i++;
        }return j+1;
    }
}