package tx03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class tx04{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(strs[i]);
        br.close();
        strs = null;
        long[] presum = new long[n];
        presum[0] = arr[0];
        for (int i = 1; i < n; i++) presum[i] = presum[i - 1] + arr[i];
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 0;
        long res = 0;
        while (i < n) {
            if (!stack.isEmpty() && arr[stack.peekLast()] > arr[i]) {
                long tmp;
                if (stack.size() == 1)
                    tmp = arr[stack.pollLast()] * presum[i - 1];
                else tmp = arr[stack.pollLast()] * (presum[i - 1] - presum[stack.peekLast()]);
                if (tmp > res) res = tmp;
            } else stack.offer(i++);
        }

        while (!stack.isEmpty()) {
            long tmp;
            if (stack.size() == 1)
                tmp = arr[stack.pollLast()] * presum[n - 1];
            else tmp = arr[stack.pollLast()] * (presum[n - 1] - presum[stack.peekLast()]);
            if (tmp > res) res = tmp;
        }
        System.out.println(res);
    }
}