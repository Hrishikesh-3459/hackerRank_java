import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            l.add(i, in.nextInt());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++)
        {
            String s = in.next();
            if (s.equals("Insert"))
            {
                int x = in.nextInt();
                int y = in.nextInt();
                l.add(x,y);
            }
            else
            {
                int de = in.nextInt();
                l.remove(de);
            }
        }
        for (int it: l)
        {
            System.out.print(it + " ");
        }
    }
}
