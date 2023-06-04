package PracticeOne;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {12,34,45,65,83};
        BinarySearch obj = new BinarySearch();

        int i = obj.searchIndex(a,85,0,a.length-1);
        if(i == -1)
        {
            System.out.println("Value doesn't exists in array");
        }else{
            System.out.println(i);
        }
    }

    public int searchIndex(int[] a, int val, int start, int end)
    {
        if(a.length<=0 || start>end)
        {
            return -1;
        }

        int mid = (start + end)/2;

        if(val == a[mid])
        {
            return mid;
        }

        if(val<a[mid])
        {
            return searchIndex(a, val, start, mid-1);
        }else{
            return searchIndex(a, val, mid+1, end);
        }
    }
}
