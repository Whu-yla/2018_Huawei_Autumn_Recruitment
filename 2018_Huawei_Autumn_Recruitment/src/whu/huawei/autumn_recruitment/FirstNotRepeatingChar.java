package whu.huawei.autumn_recruitment;

import java.util.Scanner;

public class FirstNotRepeatingChar
{

    public static void main(String[] args)
    {   int num=0;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        if (string == null || string.equals("")){System.out.println("NULL");}
        int[] records = new int[256];
        for (int i = string.length()-1; i >= 0; i--)
        {
            records[string.charAt(i)]++;
        }
        for (int i = string.length()-1; i >= 0; i--)
        {
            char curChar = string.charAt(i);
            //返回第一个只出现一次的字符
            if (records[curChar] == 1) {System.out.println(curChar);break;}else {num = num+1;}
            if (num == string.length()){System.out.println("NULL");}

        }
        }
}