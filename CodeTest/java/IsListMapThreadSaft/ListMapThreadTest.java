import java.lang.Runnable;
import java.lang.Thread;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

//测试在多线程只读取时候，是否线程安全

public class ListMapThreadTest{

    public  static void main(String[] args){
        
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<100;i++){
            list.add(i);
            map.put(i,i);
        }

        for(int i=0;i<200;i++){
            new Thread(new TestRunner(list,map,i),"线程"+1).start();
        }

    }


}