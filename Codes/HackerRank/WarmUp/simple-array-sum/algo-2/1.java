import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      int n,s=0;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            s+=a[i];
        System.out.print(s);
    }
}