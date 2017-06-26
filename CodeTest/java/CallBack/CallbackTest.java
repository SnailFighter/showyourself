import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.Random;

import java.lang.Exception;

public class CallbackTest{
	public static void main(String[] args){
		//线程的具体逻辑
		Callable<Integer> callback = new Callable<Integer>(){
			public Integer call() throws Exception{
				return new Random().nextInt(100);			
			}		
		};
		
		Callable<Integer> callback1 = new Callable<Integer>(){
			public Integer call() throws Exception{
				return new Random().nextInt(900000);			
			}		
		};
		
		Callable<Integer> callback2 = new Callable<Integer>(){
			public Integer call() throws Exception{
				//异常
				return 100/0;
			}		
		};

		FutureTask<Integer> future  = new FutureTask<Integer>(callback);
		FutureTask<Integer> future1  = new FutureTask<Integer>(callback1);
		FutureTask<Integer> future2  = new FutureTask<Integer>(callback2);
		new Thread(future).start();
		new Thread(future1).start();
		new Thread(future2).start();
		try{
			Thread.sleep(2000);	
			System.out.println(future.get());
			System.out.println(future1.get());
			System.out.println(future2.get());	
		}catch(Exception e){
			System.out.println("捉到了一个异常");
		}
	}
}
