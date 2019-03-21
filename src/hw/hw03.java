package hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class hw03 {
    static class Obj{
        String name;
        String state;
//        String from;

        public Obj(String name, String state) {
            this.name = name;
            this.state = state;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> objs = new HashMap<>();

        while (sc.hasNext()){
            String str = sc.next();
            String[] split = str.split("\\|");
            String name = split[1];
            String  sign = split[2];

//        Obj obj = new Obj(split[1], split[2]);
            if(!objs.containsKey(name)){
                if(split[0].equals("RmApp")&&sign.equals("start")){
                    System.out.println(name+"|submitted;");
                    objs.put(split[1],"submitted");

                }

            }else if(objs.containsKey(name)){
                if(split[0].equals("ResouceScheduler")&&objs.get(name).equals("submitted")&&sign.equals
                        ("app_accepted"))
                {
                    objs.put(name,"scheduled");
                    System.out.println(name+"|scheduled;");

                }
                else if(split[0].equals("RmContainer")&&objs.get(name).equals("scheduled")&&sign.equals
                        ("container_allocated")){
                    objs.put(name,"allocated");
                    System.out.println(name+"|allocated;");


                }
                else if(split[0].equals("ApplicationMasterLauncher")&&objs.get(name).equals("scheduled")&&sign.equals
                        ("launched")){
                    objs.put(name,"runing");
                    System.out.println(name+"|runing;");


                }
                else if(split[0].equals("ResouceScheduler")&&objs.get(name).equals("running")&&sign.equals
                        ("finished")){
                    objs.put(name,"finished");
                    System.out.println(name+"|finished;");


                }
                else if(split[0].equals("RmApp")&&!objs.get(name).equals("finish")&&sign.equals
                        ("kill")){
                    objs.put(name,"killed");
                    System.out.println(name+"|killed;");
                }
            }

        }



    }
}
