package wz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wz001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 1; i <=n ; i++) {
            arr.add(i);
        }
        int vz = 0;
        int cnt = 0;
        while (arr.size()>1){
            vz =(vz+m-1)%arr.size();
            cnt++;
            System.out.print(arr.get(vz));
            if(cnt<n-1){
                System.out.print(" ");
            }else if(cnt==n-1){
                System.out.print("\n");
            }
            arr.remove(vz);
        }
        System.out.print(arr.get(0));
    }
}
