public class Print extends Thread implements Runnable{
	/*
	如果public run 与 protected run 两个方法同时存在，是编译不过去的，编译到第二个run方法时，会报已经再类中
	定义了run（）,所以方法的重载必须是返回值或者参数不一样才可以。
	*/
	@Override
	public void run(){
		System.out.println("running Print run ");
	}
	
	/**
	* 写成protected的话会报错误：正在尝试分配耕地的访问权限；以前为public
	
	protected void run(){
		System.out.println("running Print protected run ");
	}
	*/
	
	
	
	public static void main(String[] args){
		new PrintThread().start();
	}
}
