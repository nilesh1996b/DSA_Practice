package PracticeFive;

import java.util.Arrays;

public class LargestContiguousSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,3};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        String str = "";

        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                System.out.print(arr[i] + " ");
            }

        }

        System.out.print(arr[arr.length-1]);

    }

    static void selectionSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    static void insertionSort(int[] arr)
    {
        for(int i = 1; i<arr.length; i++)
        {
            int key = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]>key; j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }
}
