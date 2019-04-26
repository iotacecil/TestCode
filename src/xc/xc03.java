package xc;

import java.util.HashMap;
import java.util.Scanner;

public class xc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] paths = sc.next().split(" ");
        HashMap<String,Integer> cnts = new HashMap<>();
        for (int i = 0; i <paths.length ; i++) {
            int idx = 1;

            String tmp = paths[i];
            String path = "";
            boolean first = true;
            System.out.print("1");
            while (idx<tmp.length()){
                if(tmp.charAt(idx)!='/'){
                    path+=tmp.charAt(idx);
                }else if(tmp.charAt(idx)!='/'){
                    if(first){
                        first = false;
                        continue;
                    }
                    cnts.put(path,cnts.getOrDefault(path,0)+1);


                }
                tmp = tmp.substring(1);
                if (tmp.indexOf("/")<0) {
                    System.out.print(1);
                    if(i!=paths.length-1)
                        System.out.println(" ");
                    break;
                }
                idx+= tmp.indexOf("/");
                System.out.println(idx);

                System.out.println(path);
                tmp = tmp.substring(idx);
                //
                System.out.println(tmp);
                cnts.put(path,cnts.getOrDefault(path,0)+1);
                System.out.print(cnts.get(path));
            }



        }
    }
}
