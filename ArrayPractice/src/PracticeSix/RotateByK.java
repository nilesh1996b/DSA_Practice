package PracticeSix;

import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int[] temp = new int[k];

        for(int i = 0; i<k; i++)
        {
            temp[i] = arr[i+arr.length-k];
        }

        System.out.println(Arrays.toString(temp));

        for(int i = arr.length-1; i>=k; i--)
        {
            arr[i] =arr[i-k];
        }

        for(int i = 0; i<temp.length; i++)
        {
            arr[i] = temp[i];
        }
        System.out.print(Arrays.toString(arr));

        String str2 = "helloEveryOne";

        System.out.println(str2.length());
    }
}
