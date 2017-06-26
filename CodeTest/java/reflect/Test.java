//该类用于反射测试



import java.util.List;
import java.util.ArrayList;

import java.lang.Double;


public class Test implements TestInterface{
	
	private int i;
	private String[] strs;
	protected List list;
	public Double d;
	
	public Test(){}
	
	public Test(int i){
		this.i = i;
		
	}
	
	public Test(int i,Double d){
		this.i=i;
		this.d = d;	
	}
	
	private void getI (){
		System.out.println("the value of i is "+i);
	}
	
	public void  getList(){
		list = new ArrayList<String>();
		list.add("test");
		System.out.println(list.get(0));
	}
	
	@Override
	public void testPrintln(){
		System.out.println("打印。。。。。。。。。");
	}
	
}
