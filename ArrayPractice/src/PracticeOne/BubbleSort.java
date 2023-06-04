package PracticeOne;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {12,5,3,-1};

        BubbleSort obj = new BubbleSort();
        obj.print(a);
        obj.bubbleSort(a);
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

    public void bubbleSort(int[] a)
    {
        if(a.length <= 1) return;

        for(int i = 0; i<a.length-1; i++)
        {
            int count = 0;
            for(int j = 0; j<a.length-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++;
                }
            }

            if(count==0)
            {
                return;
            }

        }
    }
}
