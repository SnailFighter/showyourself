public class IntegerProblems {
	public static void main(String[] args){
		int a=100;
		int b=100;
		System.out.println("a==b:"+(a==b));

		a=300;
		b=300;
		System.out.println("a==b:"+(a==b));

		Integer integer1 = 100;
		Integer integer2 = 100;
		System.out.println("integer1==integer2:"+(a==b));
		System.out.println("integer1.equals(integer2):"+(integer1.equals(integer2)));

		Integer integer1 = 1000;
		Integer integer2 = 1000;
		System.out.println("integer1==integer2:"+(a==b));
		System.out.println("integer1.equals(integer2):"+(integer1.equals(integer2)));


	}
}