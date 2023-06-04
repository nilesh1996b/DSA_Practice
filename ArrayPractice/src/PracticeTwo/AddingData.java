package PracticeTwo;
public class AddingData {
    Counter count = new Counter();
    int x = count.getCount();
    public  void addOnPosition(int[] arr, int val, int pos)
    {
        pos = pos-1;
        for(int i = count.getCount()-1; i>pos; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
    }
    public void addLast(int[] arr, int val)
    {
        for(int i = 1; i<count.getCount(); i++)
        {
            arr[i-1] = arr[i];
        }
        arr[count.getCount()-1] = val;
    }
    public void addFirst(int[] arr, int val)
    {
        for (int i = count.getCount()-1; i>0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
    }
    public void addData(int[] arr, int val)
    {
        if(count.getCount()==arr.length-1) return;
        count.setCount(x);
        arr[count.getCount()] = val;
        x++;


    }

    public void print(int[] arr)
    {
        for(int i = 0; i<=count.getCount(); i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
