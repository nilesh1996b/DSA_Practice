package PracticeSix;

public class CheckPalindrome {

    public static int max = Integer.MIN_VALUE;
    public static String check;
    public static void main(String[] args) {
        String str = "thisracecarisgood";
        checkIt(str);
    }

    public static void checkIt(String str)
    {
        int length = 0;
        for(int i = 0; i<str.length(); i++)
        {
            String bag = "";
            for(int j = i; j<str.length(); j++)
            {
                bag += str.charAt(j);
                if(checkPalIndrome(bag)>max)
                {
                    max = checkPalIndrome(bag);
                    check = bag;
                };
            }


        }

        System.out.println(max);
        System.out.println(check);
    }

    public static int checkPalIndrome(String bag)
    {
        String temp = "";
        int n = bag.length();

        for(int i = n-1; i>=0; i--)
        {
            temp+=bag.charAt(i);
        }

        if(bag.equals(temp))
        {
            return bag.length();
        }

        return 0;
    }
}
