package PracticeThree;
public class DeleteData {
    static int count = 5;
    public static void main(String[] args) {
        int[] a = {20,10,30,50,40};
        sortByBubble(a);
        print(a);

        deleteByPosition(a, 2);
        print(a);

        deleteByValue(a, 10);
        print(a);

    }

    public static void deleteByValue(int[] a, int val)
    {

        int index = searchIndex(a,val,0,count);
        if(index==-1)
        {
            return;
        }
        deleteByPosition(a,index+1);
    }
    private static int searchIndex(int[] a, int val, int start, int end)
    {
        if(count<0 || start>end) return -1;
        int mid = (start+end)/2;
        if(a[mid]==val) return mid;
        else if(a[mid]>val) return searchIndex(a,val,0,mid-1);
        else return searchIndex(a,val,mid+1,end);
    }
    public static void deleteByPosition(int[] a, int pos)
    {
        pos = pos-1;
        if(count<0) return;
        for(int i = pos; i<count-1; i++)
        {
            a[i] = a[i+1];
        }
        count--;
    }
    public static void deleteLast()
    {
        if(count<0) return;
        count--;
    }

    public static void deleteFirst(int[] a)
    {
        if(count<0) return;
        for(int i = 1; i<count; i++)
        {
            a[i-1] = a[i];
        }
        count--;
    }
    public static void print(int[] a)
    {
        for(int i = 0; i<count; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sortByBubble(int[] arr)
    {
        for(int i = 0; i<count-1; i++)
        {
            int c = 0;
            for(int j = 0; j<count-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    c++;
                }
            }
            if(c==0)
            {
                break;
            }
        }
    }

}
