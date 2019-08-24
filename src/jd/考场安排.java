package jd;

import java.util.*;

/*
题目描述：
某校在积极推行无人监考制度，但是总有学生是不自觉的，
如果将两个很熟的异性朋友放在同一个考场里，他们就会交流甚至作弊。
因此一个考场中不能允许两个很熟的异性朋友存在，学校希望通过搬出一部分学生的方法来改善这一问题。

但是又因为教室数量有限，因此希望一个教室中容下的学生尽可能多，
即需要搬出教室的学生数量尽可能少，请你输出搬出教室人数最少，且字典序最小的方案。

 接下来m行，每行有两个整数，x和y，表示第x号男生和第y号女生是朋友。
 男生的编号均为[1,n]，女生的编号为[n+1,2n]。

男生的编号均为[1,n]，女生的编号为[n+1,2n]。
2 2
1 3
1 4
样例输出
1
1
 */




public class 考场安排 {
   static class Person{
        int id;
        List<Integer> friend;

        public Person(int id) {
            this.id = id;
            this.friend = new ArrayList<>();
        }

       @Override
       public String toString() {
           return "Person{" +
                   "id=" + id +
                   ", friend=" + friend +
                   '}';
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Person[] people = new Person[n*2];
        for (int i = 0; i <n*2 ; i++) {
            people[i] = new Person(i);
        }
//0,1  2,3  n = 2
        for (int i = 0; i <m ; i++) {
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;
            if(left<n && right>=n) {
                people[left].friend.add(right);
                people[right].friend.add(left);
            }
        }
        PriorityQueue<Person> pq = new PriorityQueue<>((a,b)->a.friend.size()==b.friend.size()?a.id-b.id:b.friend
                .size()-a.friend.size());
        
        for (Person p : people){
            if(p.friend.size()>0){
                pq.add(p);
            }
        }
        int cnt = 0;
//        Arrays.sort(people,(a,b)->a.friend.size()==b.friend.size()?a.id-b.id:b.friend.size()-a.friend.size());
        if(pq.isEmpty()){
            System.out.println(cnt);
            System.out.println(0);
            return;
        }
        List<Integer> nedd2move = new ArrayList<>();

        while (!pq.isEmpty()) {

            Person popular = pq.poll();

            nedd2move.add(popular.id);
            cnt++;
//            System.out.println("id:"+people[0].id+" fr:"+people[0].friend);

            PriorityQueue<Person> tmp = new PriorityQueue<>((a, b) -> a.friend.size() == b.friend.size() ? a.id - b.id : b.friend
                    .size() - a.friend.size());

//                System.out.println("从"+fd+"删除");
            while (!pq.isEmpty()) {
                Person pp = pq.poll();
                if (pp.friend.contains((Integer) popular.id)) {
                    pp.friend.remove((Integer) popular.id);
                }
                if (pp.friend.size() > 0) {
                    tmp.add(pp);
                }

            }

            pq = tmp;

//                System.out.println(people[fd]);

            

//            Arrays.sort(people,(a,b)->a.friend.size()==b.friend.size()?a.id-b.id:b.friend.size()-a.friend.size());
//            System.out.println(Arrays.toString(people));

        }

        System.out.println(cnt);
        for (int i = 0; i <cnt ; i++) {


            if(i==cnt-1){
                System.out.print(nedd2move.get(i)+1);

            }else
            System.out.print(nedd2move.get(i)+1+" ");
        }


    }
}
