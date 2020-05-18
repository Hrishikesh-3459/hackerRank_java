import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzzzz";
        String largest = "";
        
        for(int i = 0; i < (s.length() - k)+1; i++)
        {
            String x = s.substring(i, i + k);
            if (x.compareTo(smallest) < 0)
            {
                smallest = x;
            }
            if (x.compareTo(largest) > 0)
            {
                largest = x;
            }
        }
        
        return smallest + "\n" + largest;
    }

