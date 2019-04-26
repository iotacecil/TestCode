package wz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class wz02 {
    public static void countQueue(int personNumber,int number){

        Queue<Integer> persons =  new LinkedList<Integer>();
        for (int i = 0; i < personNumber; i++) {
            persons.add(i+1);
        }

        int cnt = 0;
        int counts = 0;
        while (!persons.isEmpty()) {

            Integer person = persons.poll();

            counts++;

            if (counts % number == 0) {
                cnt++;

                System.out.print(person);
                if(cnt == personNumber-1){
                    System.out.print("\n");
                }else if(cnt< personNumber-1){
                    System.out.print(" ");
                }
            } else {
                //不是,继续入队列
                persons.add(person);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        countQueue(n,m);
    }

}
