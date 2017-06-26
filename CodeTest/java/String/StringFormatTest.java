//字符创格式化验证
public class StringFormatTest{
public static void main(String[] args){
int[] hblist = {1,4,6,7,4,4,4,4};
String stringJoin = String.join(",,","a","b");
System.out.println("String.join() return :  "+stringJoin);
String stringFormat  = String.format(",{0},",hblist[5]);
System.out.println("String.format() return:  "+stringFormat);



	StringBuffer str = new StringBuffer("String");
	str.reverse();//反转有这么方便的方法啊
	System.out.println("StringBuffer.reverse() return   "+str);

}
}
