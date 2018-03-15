
    import java.lang.Runnable;
    import java.lang.Thread;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Map;
    import java.util.HashMap;
    
    public class TestRunner implements Runnable{
        

        
        private String name = "线程";

        private List<Integer> list;
        private Map<Integer,Integer> map;
        private int id;

        private int temp=-1;

        private int  temp1 = -1;

        public TestRunner(List<Integer> list,Map<Integer,Integer>  map,int id){
            this.list = list;
            this.map = map;
            this.id=id;
        }

        @Override
        public void run(){
            for(int i=0;i<100;i++){
                
                if(list.get(i)<temp){
                        System.out.println("ArrayList多线程下只读不安全");
                }else{
                     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>ArrayList多线程下只读安全");
                }

                if(map.get(i)<temp){
                        System.out.println("hashmap多线程下只读不安全");
                }else{
                     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>hashmap多线程下只读安全");
                }

              
               
                temp=list.get(i);
            }
        }

    }