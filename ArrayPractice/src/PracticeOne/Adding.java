package PracticeOne;

public class Adding {
    int count = 0;
    public static void main(String[] args) {

        Adding o = new Adding();

        int[] a = new int[5];

        for(int j =0; j<a.length; j++)
        {
            o.insert(a, j+1);
        }


        o.print(a);
        o.insertAtStart(a,35);
        o.print(a);
        o.insertAtIndex(a,100,2);
        o.print(a);

    }

    public void insert(int[] a, int val)
    {
        a[count++] = val;
    }

    public void print(int[] a)
    {
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void insertAtStart(int[] a, int val)
    {
        for(int i = a.length-1; i>0; i--)
        {
            a[i] = a[i-1];
        }

        a[0] = val;
    }

    public void insertAtIndex(int[] a, int val, int index)
    {
        for(int i = a.length-1; i>index; i--)
        {
            a[i] = a[i-1];
        }

        a[index] = val;
    }


}
