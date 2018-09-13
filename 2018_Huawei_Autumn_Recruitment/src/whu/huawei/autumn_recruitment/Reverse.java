package whu.huawei.autumn_recruitment;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] strlist = input.trim().split(" +");
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<strlist.length; i++){
            sb.append(new StringBuilder(strlist[i]).reverse().toString() + " ");
        }

        System.out.println(sb.toString().trim());
    }
    }
