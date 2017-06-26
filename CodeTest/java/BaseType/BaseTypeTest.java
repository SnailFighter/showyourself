public class BaseTypeTest{
		public static void main(String[] args){
			int[] a  = new int[10];
			String[] strs  = new String[10];
			
			System.out.println("整形数组长度  "+a.length+"   字符串数组长度   "+strs.length);
			System.out.println("整形数组中数据  "+a[0]+"字符串数组中数据为  "+strs[0]);
			
			System.out.println("其他位置数据为  "+a[3]+"   String  "+strs[3]);
		}
}
