public class PrintThread extends Thread{
	@Override
	public void run(){
		System.out.println("running PrintThread run ");
	}
	
	public static void main(String[] args){
		new PrintThread().start();
	}
}
