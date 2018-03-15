import java.util.List;

public class NullJudge {
	public static void main(String[] args) {
		Test test = null;
		if(null == test) {
			System.out.println("OK!!!");
		}
		if(test==null){
			System.out.println("test==null ok!!!");
		}
		//notice:"=" instead of "=="
		if(null = test){
			System.out.println("null = test ok!!!");
		} 
		

		//notice:  "=" instead of "=="
		if(test=null) {
			System.out.println("test=null ok !!!");
		}
		

	}
}
