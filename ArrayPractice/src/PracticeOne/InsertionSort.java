package PracticeOne;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {1,5,6,4,-1};

        InsertionSort obj = new InsertionSort();
        obj.print(a);
        insertionSort(a);
        obj.print(a);
    }

    public void print(int[] a)
    {
        for(int x:a)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr) {

        if(arr.length<=1)
        {
            return;
        }
        for(int i = 1; i<arr.length; i++)
        {
            int key = arr[i];
            int j;
            for(j=i-1; j>=0 && arr[j]>key; j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }


}
