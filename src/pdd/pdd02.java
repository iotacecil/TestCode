package pdd;

import java.util.Scanner;

public class pdd02 {
    public static String removeDuplicateLetters(String s)
    {
        if(s==null || s.length()<=0)
            return "";
        else
        {
            int[] count=new int[26];
            for(int i=0;i<s.length();i++)
                count[s.charAt(i)-'a']++;
            int pos=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)<s.charAt(pos))
                    pos=i;
                count[s.charAt(i)-'a']--;
                if(count[s.charAt(i)-'a']==0)
                    break;
            }
            //System.out.println(s.charAt(pos)+"     "+s.substring(pos+1).replace(""+s.charAt(pos),""));
            String res = s.charAt(pos)+ removeDuplicateLetters(s.substring(pos+1).replace(""+s.charAt(pos),""));
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.toLowerCase();
        System.out.println(removeDuplicateLetters(s).charAt(0));

    }
}
