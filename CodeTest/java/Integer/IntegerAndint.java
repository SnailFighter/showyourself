import java.lang.Integer;

public class IntegerAndint {
	public static void main(String[] args){
		int i = 1;
		Integer j = new Integer(1);
		System.out.println(i==j);

		Integer o = new Integer(255);
		Integer p = new Integer(255);
		System.out.println(o==p);

		Integer w = new Integer(11);
		Integer m = new Integer(11);
		System.out.println(w==m);

		Integer w1 = 11;
		Integer m1 = 11;
		System.out.println(w1==m1);//true
		//over cache scale 
		Integer w2 = 1111;
		Integer m2 = 1111;
		System.out.println(w2==m2);//false
	}
}