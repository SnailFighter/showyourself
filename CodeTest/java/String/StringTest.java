//测试字符串与数值数学运算
public class StringTest { 
	public static void main(String[] args) { 
		String str = "420"; 
		String str1 = "abc";
		int a=Integer.parseInt(str); 
		a +=42; 
		int b =10;
		/*
		下面这句话会报错：不兼容的类型: String无法转换为int。并不是自己所想的会取字符串的ascii码值与int相加。
		*/
		//a+=str1;
		
		char ch = 'c';
		/*
		*下面这句话时正觉的，b的值最后为109 正好ch取的是对应的ASCII	码值99
		*/
		b+=ch;
	
		System.out.println(a); 
		System.out.println(b); 
	} 
} 
