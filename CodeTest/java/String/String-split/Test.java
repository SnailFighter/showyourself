
public class Test{
	 public static void main(String[] args) {
		String str = "upload/financingService/9411503747135706AT01.jpeg";
		String[] arrs = str.split(".");
		System.out.println(arrs.length);
		System.out.println(arrs[0]);
		System.out.println(arrs[1]);
	}
}