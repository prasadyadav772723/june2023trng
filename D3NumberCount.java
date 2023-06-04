public class D3NumberCount{
    public static void main(String args[])
    {
        String str = "his birthday is on 1st of 9th Month";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                count++;
        }
        System.out.println("Total number of Digits = "
                           + count);
    }
}