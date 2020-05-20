import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delims = "[ !,?.\\_'@]+";
        String[] arrofStr = s.trim().split(delims);
        int x = s.trim().length();
        if (x == 0 || x > 400000)
        {
            System.out.println(0);
            return;
        }
        System.out.println(arrofStr.length);
        for (String a: arrofStr)
        {
            System.out.println(a);
        }
        scan.close();
    }
}

