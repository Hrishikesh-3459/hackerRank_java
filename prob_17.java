import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
        {
            return false;
        }
        for (int i = 0; i < a.length(); i ++)
        {
            char cur = Character.toLowerCase(a.charAt(i));
            int freq_b = 0;
            int freq_a = 0;
            for(int j = 0; j < a.length(); j++)
            {
                char ind_a = Character.toLowerCase(a.charAt(j));
                char ind_b = Character.toLowerCase(b.charAt(j));
                if (Character.compare(ind_a, cur) == 0)
                {
                    freq_a++;
                }
                if (Character.compare(ind_b, cur) == 0)
                {
                    freq_b++;
                }
            }
            if (freq_a != freq_b)
            {
                return false;
            }

        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
