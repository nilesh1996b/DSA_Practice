package PracticeOne;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {7,2,1,3,0};

        SelectionSort obj = new SelectionSort();
        obj.print(a);
        selectionSort(a);
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

    public static void selectionSort(int[] arr)
    {
        if(arr.length<=1)
        {
            return;
        }

        for(int i = 0; i< arr.length-1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex = j;
                }
            }
            if(minIndex!=i)
            {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
