package tx;

class Dog implements Cloneable{
    public String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Dog)super.clone();
    }
}

public class p1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog d = new Dog("aaa");
        Dog d2 = (Dog)d.clone();
        d2.name = "jjj";
        System.out.println(d.name);
        d.name = "bbb";
        System.out.println(d2.name);
    }



    public static String findMaxSub(String src){
      String s = src.toLowerCase();
      int cnt =0;
      int maxcnt = 0;
      int start = -1;
      int end = -1;
      String rst =src;

      for (int j = 1; j <s.length() ; j++) {
          if(s.charAt(j)-s.charAt(j-1) == 1){
              if(cnt ==0){
                  start = j-1;
              }
              cnt++;
          }else{
              cnt=0;
              start = -1;
          }
          if(cnt > maxcnt){
              end = j;
              rst = src.substring(start,end+1);
          }
          maxcnt = Math.max(cnt,maxcnt);
      }
      return rst;
  }




}
