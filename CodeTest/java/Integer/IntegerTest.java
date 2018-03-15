import java.lang.Integer;

public class IntegerTest {
	public static void main(String[] args){
		int result = 0;

		result = Integer.reverse(100);

		System.out.println(String.format("Integer.reverse(100)=%d",result));

		System.out.println(Integer.compare(1,3));

		System.out.println(Integer.decode("2"));

		System.out.println(String.format("Integer.bitCount(4)=%d",Integer.bitCount(4)));

		
	}
}