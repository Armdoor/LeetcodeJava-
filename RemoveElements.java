class Solution {
    public int removeElement(int[] a, int n) {
     int i=0,j=0;
        
        while(i<a.length)
        {
            if (a[i]!=n)
            {
                a[j]=a[i];
                j++;
            }i++;
        }
        return j;
}
}