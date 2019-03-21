package pdd;

import java.util.*;

public class pdddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // <坐标, 金额>
            int a = sc.nextInt(), b = sc.nextInt();
            map.put(a, b);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet()); //转换为list

        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
//            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i).getKey() - list.get(j).getKey()) >= d && (list.get(i).getValue() - list.get(j).getValue()) > max) {
                    max = list.get(i).getValue() - list.get(j).getValue();
                    break;
                }
            }
        }
        System.out.println(max);
    }

}
