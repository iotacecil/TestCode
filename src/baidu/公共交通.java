package baidu;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class 公共交通 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("log")));
        HashMap<String,Integer> map = new HashMap<>();
        String line;
        while((line = bf.readLine())!=null){
            String[] strs = line.split(":");
            if(map.containsKey(strs[0])){
                map.put(strs[0],map.get(strs[0]+1));
            }else{
                map.put(strs[0],1);
            }
        }
        Scanner sc = new Scanner(System.in);
        String error = sc.nextLine();
        System.out.println(map.get(error));

    }
}
