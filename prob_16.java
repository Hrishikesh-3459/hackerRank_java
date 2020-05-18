import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder input1 = new StringBuilder();
        input1.append(A);
        input1.reverse();
        String x = input1.toString();
        // System.out.println(x);
        if (x.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
    }
}



