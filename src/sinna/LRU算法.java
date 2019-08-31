package sinna;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCach {
    Map<Integer, Node> cache;
    LinkedList<Node> list;

    class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            //this.idx =idx;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value;
        }
    }

    int capacity;

    public LRUCach(int capacity) {
        list = new LinkedList<>();
        cache = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            list.remove(node);
            list.add(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            list.remove(node);

        } else {
            if (list.size() == capacity) {
                //  System.out.println(list);
                Node first = list.getFirst();
                cache.remove(first.key);
                list.removeFirst();
            }

        }
        Node node = new Node(key, value);
        list.add(node);
        cache.put(key, node);
    }
}


public class LRU算法 {
}
