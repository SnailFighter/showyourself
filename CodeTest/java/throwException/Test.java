import java.lang.Long;
import java.lang.Exception;

public class Test {
	public static void main(String[] args){
		ThrowsException throwsException = new ThrowsException();
		Long currentTime = System.currentTimeMillis();
		for(int i=0;i<20000;i++){
			try{
					throwsException.throwException(i);
				}catch(Exception e){}
		}
		Long currentTime1 = System.currentTimeMillis();
		System.out.println((currentTime1-currentTime)+"ms");


		//########################################################
		Long currentTime2 = System.currentTimeMillis();
		for(int i=0;i<20000;i++){
			throwsException.noThrowException(i);
		}
		Long currentTime3 = System.currentTimeMillis();
		System.out.println((currentTime3-currentTime2)+"ms");

	}
}