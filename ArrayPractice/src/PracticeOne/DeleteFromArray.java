package PracticeOne;

public class DeleteFromArray {
    static int count = 5;
    public static void main(String[] args) {
        int[] a = {12,34,45,6,34,13};
        DeleteFromArray obj = new DeleteFromArray();
        obj.print(a);
//        obj.deleteFromEnd(a);
//        obj.print(a);
//        obj.deleteFromStart(a);
//        obj.print(a);
        obj.deleteByPosition(a,9);
        obj.print(a);
//        obj.deleteByValue(a,10);
//        obj.print(a);
    }

    public void deleteFromEnd(int[] a)
    {
        if(count<= 0)
        {
            return;
        }
        count--;
    }

    public void deleteFromStart(int[] a)
    {
        if(count<= 0)
        {
            return;
        }

        for(int i = 0; i<count-1; i++)
        {
            a[i] = a[i+1];
        }
        count--;
    }

    public void deleteByPosition(int[] a, int position)
    {
        if(count<= 0 || position>count)
        {

            System.out.println(count<=0?"There are no element in the array":"There are only " + count + " element");
            return;
        }

        for(int i = position; i<count-1; i++)
        {
            a[i] = a[i+1];
        }
        count--;
    }

    public void deleteByValue(int[] a, int value)
    {
        if(count<=0)
        {
            return;
        }

        int check = 0;

        for(int i = 0; i<count;i++)
        {
            if(a[i]==value)
            {
                deleteByPosition(a,i);
                check++;
            }
        }

        if(check == 0)
        {
            System.out.println("There is no " + value);
        }
    }














    public void print(int[] a)
    {
        for (int i = 0; i<count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }



}
