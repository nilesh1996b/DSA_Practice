package PracticeTwo;

public class DeleteData {

    Counter count = new Counter();


    public static void main(String[] args) {
        int[] a = new int[5];
        AddingData o = new AddingData();
        o.addData(a,10);
        o.addData(a,20);
        o.addData(a,30);
        o.addData(a,40);
        o.addData(a,50);
        o.addData(a,50);
        o.print(a);

        DeleteData d = new DeleteData();

    }


}
